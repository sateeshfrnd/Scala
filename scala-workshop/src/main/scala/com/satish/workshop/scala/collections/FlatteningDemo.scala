package com.satish.workshop.scala.collections

/**
 * @author satish
 *
 * Covert list of lists (a sequence of sequences) and to single list (sequence)
 *
 */
object FlatteningDemo {
  def main(arg: Array[String]) {

    val lol = List(List(1, 2), List(3, 4))
    println("lol = " + lol)

    val lol_flatten = lol.flatten;
    lol_flatten.foreach { x => println(x) }

    println("lol.flatten.sum = "+lol.flatten.sum)
    
    val aoa = Array(Array(1, 2), Array(3, 4))
    val aoa_flatten = aoa.flatten;
    aoa_flatten.foreach { x => print(x + " ; ") }

    val schoolFrnds = List("Shankar","Sagar","Anand")
    val collegeFrnds = List("Raghu","Madhu","Naidu","Jaghu")
    val myFrnds = List(schoolFrnds,collegeFrnds).flatten
    println(myFrnds)
    
    val list = List("Hello", "world")
    println(list.flatten)
    
  }
}