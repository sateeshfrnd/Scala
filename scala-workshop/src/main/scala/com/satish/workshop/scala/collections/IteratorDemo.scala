package com.satish.workshop.scala.collections

/**
 * @author satish
 * 
 * An iterator isn’t a collection; instead, it gives you a way to access the elements in a collection, one by one
 */
object IteratorDemo {
  def main (arg: Array[String]){
    val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    println("days = " + days)

    var iterator = days.iterator
    iterator.foreach { x => print(x+" ; ") }
    iterator.foreach { x => print(x+" ; ") } // won’t get any output, because the iterator has been exhausted
    
  }
}