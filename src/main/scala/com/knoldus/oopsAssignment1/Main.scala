package com.knoldus.oopsAssignment1

object Main {
  def main(args: Array[String]): Unit = {
    println("\n********** DoubleQueue operations ***********\n")
    val doubleQ = new DoubleQueue()  // creating the object of DoubleQueue Class for further operations.
    // adding items to the queue
    doubleQ.enqueue(3)
    doubleQ.enqueue(5)
    doubleQ.enqueue(7)
    doubleQ.enqueue(6)

    // removing items from the queue
    doubleQ.dequeue()
    doubleQ.dequeue()
    doubleQ.dequeue()
    doubleQ.dequeue()
    doubleQ.dequeue()

    println("\n********** SquareQueue operations **********\n")
    val squareQ = new SquareQueue()  // creating the object of SquareQueue Class
    // adding items to the queue
    squareQ.enqueue(2)
    squareQ.enqueue(12)
    squareQ.enqueue(9)
    squareQ.enqueue(32)

    // removing items from the queue
    squareQ.dequeue()
    squareQ.dequeue()
    squareQ.dequeue()
    squareQ.dequeue()
    squareQ.dequeue()

  }
}
