package com.globant.commandpatternapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val detailOrder1 = "Bacon, Eggs, Coffee, Orange juice"
    private val detailOrder2 = "Rice, Eggs, Beans, lemon juice"
    private val detailOrder3 = "Soup, Fideos, Pizza, Soda club"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.let {
            OrdersCommandProcessor()
                .addToQueue(AddOrderCommand(it, detailOrder1, 1L))
                .addToQueue(AddOrderCommand(it, detailOrder2, 2L))
                .addToQueue(AddOrderCommand(it, detailOrder3, 3L))
                .addToQueue(PayOrderCommand(it, detailOrder1, 1L))
                .addToQueue(PayOrderCommand(it, detailOrder2, 2L))
                .addToQueue(PayOrderCommand(it, detailOrder3, 3L))
                .processCommands()
        }


    }
}