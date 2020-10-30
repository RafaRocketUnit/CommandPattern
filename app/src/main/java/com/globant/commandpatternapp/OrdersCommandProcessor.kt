package com.globant.commandpatternapp

class OrdersCommandProcessor {
    private val queue = ArrayList<OrderCommand>()

    fun addToQueue(orderCommand: OrderCommand) : OrdersCommandProcessor = apply {
        queue.add(orderCommand)
    }

    fun processCommands(): OrdersCommandProcessor = apply {
        queue.forEach { it.execute()}
        queue.clear()
    }
}