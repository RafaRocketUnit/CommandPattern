package com.globant.commandpatternapp

import android.widget.TextView

class PayOrderCommand(private val textView: TextView,
                       private val detail: String,
                       private val id: Long): OrderCommand {

    override fun execute() {
        textView.text = textView.text.toString() + "\n\n Pay for Order: $id" + "\n Detail: $detail"
    }
}