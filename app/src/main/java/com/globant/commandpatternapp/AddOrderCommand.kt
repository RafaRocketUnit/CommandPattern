package com.globant.commandpatternapp

import android.widget.TextView

class AddOrderCommand(private val textView: TextView,
                      private val detail: String,
                      private val id: Long): OrderCommand {

    override fun execute() {
        textView.text = textView.text.toString() + "\n\n Add Order: $id" + "\nDetail: $detail"
    }
}