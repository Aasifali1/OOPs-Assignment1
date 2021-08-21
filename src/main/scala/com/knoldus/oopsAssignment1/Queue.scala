package com.knoldus.oopsAssignment1
import scala.collection.mutable.ListBuffer

trait Queue{      // The Queue trait having two methods, the dequeue method having body.
  var front: Int = -1
  var rear: Int= -1
  var bufferItem = new ListBuffer[Int]()
  def enqueue(item:Int)

  /* This method will dequeue the  item to the queue in FIFO Order.
  *  The first item will be dequeued from the list and front and rear will be decreased.
  * */
  def dequeue(): Unit ={
    if (front == -1 && rear == -1){  // If the queue is empty then both the values of front and rear will be increased by one.
      println("Queue is Empty")
    }
    else if (front ==  rear) // If the queue has only one item then the item will be removed.
      {                        // and the value of both front and rear will be -1.
        bufferItem.remove(0)
        println("Item dequeued")
        front = -1
        rear = - 1
        val list =bufferItem.toList
        println(list)
      }
    else    // If the queue is not empty then the item will be removed.
    {       // only the value of front will be increased by one.
      bufferItem.remove(0)
      println("Item dequeued")
      front = front + 1
      val list =bufferItem.toList
      println(list)
    }

  }
}
