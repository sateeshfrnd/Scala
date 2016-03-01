package com.satish.workshop.scala.collections

import scala.collection.mutable.ArrayBuffer
/**
 * @author satish
 *
 * ArrayBuffer is an indexed sequential collection.
 * ArrayBuffer class is recommended class for mutable sequential collections.
 */
object ArrayBufferDemo {
  def main(arg: Array[String]) {

    // create an empty ArrayBuffer
    var fruits = ArrayBuffer[String]()
    println(fruits)

    // create an ArrayBuffer with initial elements
    var numbers = ArrayBuffer(1, 2, 3)
    println(numbers)

    // ============= Add Elements =================
    // Add an element
    numbers += 4
    println("After adding an element = " + numbers)

    // Add multiple elements
    numbers += (5, 6, 7)
    println("After adding multiple element = " + numbers)

    // Adding elements from another collection
    numbers ++= List(8, 9, 10)
    println("Adding elements from another collection = " + numbers)

    // ============= Remove Elements =================
    // Remove an element
    numbers -= 9
    println("Remove element '4' = " + numbers)

    // Remove two or more element
    numbers -= (6, 7)
    println("Remove element '(2,3)' = " + numbers)

    // Remove elements specified by another sequence
    numbers --= Array(8, 10)
    println("Remove element by specifing by Array(8, 10) = " + numbers)

    // ============= Append Elements =================
    numbers.append(6)
    println("Append element '6' using append() = " + numbers)

    numbers.append(7, 8)
    println("Append element '7,8' using append() = " + numbers)

    numbers.appendAll(Seq(9, 10))
    println("Append element by specifing by Seq(9,10) = " + numbers)

    // Remove all the elements
    numbers.clear()
    println("After removing all elements = " + numbers)

    // ============= Insert Elements =================
    // Inserts new elements at a given index into this buffer. 
    numbers.insert(0, 10)
    println("Insert '10' at index '0' = " + numbers)

    numbers.insert(0, 8, 9)
    println("Insert '8,9' at index '0' = " + numbers)

    numbers.insertAll(0, Vector(6, 7))
    println("Insert 'Vector(6,7)' at index '0' = " + numbers)

    numbers.prepend(5)
    println("prepend element 5 = " + numbers)

    numbers.prepend(3, 4)
    println("prepend element (3,4) = " + numbers)

    numbers.prependAll(Array(0, 1, 2))
    println("prepend element from Array(0,1,2) = " + numbers)

    // Create ArrayBuffer using range()
    var a = ArrayBuffer.range('a', 'h') // ArrayBuffer(a, b, c, d, e, f, g)
    println("a = " + a)
    a.trimStart(2) // ArrayBuffer(c, d, e, f, g)
    println("a.trimStart(2) = " + a)
    a.trimEnd(2) // ArrayBuffer(c, d, e)
    println("a.trimEnd(2) = " + a)

    a = ArrayBuffer.range('a', 'h') // ArrayBuffer(a, b, c, d, e, f, g)
    println("a = " + a)
    a.remove(0) // ArrayBuffer(b, c, d, e, f, g)
    println("a.remove(0) = " + a)
    a.remove(2, 3) // ArrayBuffer(b, c, g)
    println("a.remove(2,3) = " + a)

    fruits = scala.collection.mutable.ArrayBuffer("apple", "banana")
    println("fruits = "+fruits)
    val x = for (e <- fruits) yield e.toUpperCase
    println("upperCase = "+x)
    for (e <- x) println(e)

  }
}