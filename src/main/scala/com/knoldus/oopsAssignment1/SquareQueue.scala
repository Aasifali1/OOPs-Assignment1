package com.knoldus.oopsAssignment1

class SquareQueue extends Queue {

  /* Overriding the enqueue method of Queue trait
  *  This method will enqueue the  item to the queue in FIFO Order after squaring them
  *  The item will be enqueued in the last of the list and front and rear will be increased.
  * */

  override def enqueue(item:Int): Unit = {
    if (front == -1 && rear == -1)
      {
        front = front + 1
        rear = rear +1
        bufferItem += item*item
        val list = bufferItem.toList
        println("Item enqueued")
        println(list)
      }
      else {    // If the queue is not empty then the only value of rear will be increased by one.
      rear = rear + 1
      bufferItem += item * item
      val list = bufferItem.toList
      println("Item enqueued")
      println(list)
    }

  }
}
