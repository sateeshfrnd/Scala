package com.satish.workshop.scala.collections

/**
 * @author satish
 */
object ArraysDemo {
  def main(arg: Array[String]) {

    // Collection contains mixed types or multiple levels of inheritance
    trait Animal
    case class Dog(name: String) extends Animal
    case class Cat(name: String) extends Animal

    val animals = Array(Dog("Fido"), Cat("Felix"))
    println(animals)

    val fruits = Array("apple", "banana", "orange")
    for (i <- 0 until fruits.size) println(s"element[$i] => ${fruits(i)}")
    
    // ============== zipWithIndex =================
    val days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    // print the elements in the collection with a counter using the zipWithIndex
    // Here zipWithIndex returns a series of Tuple2 elements in an Array, like this:
    // Array((Sunday,0), (Monday,1), ...
    days.zipWithIndex.foreach {
      case (day, count) => println(s"$count is $day")
    }

    // zipWithIndex with a for loop
    println("zipWithIndex with a for loop")
    for ((day, count) <- days.zipWithIndex) {
      println(s"$count is $day")
    }

    // ============== Transforming =======================
    val uppercase = for(e <- fruits) yield e.toUpperCase()
    for(e <- uppercase) println(e)
    
    // converts the original collection into a sequence of Tuple2 elements
    val tuples = for (i <- 0 until fruits.length) yield (i, fruits(i))
    for(e <- tuples) println(e)
    
    // sequence of Tuple2 elements that contains each original string along with its length
    val tuples_length = for (f <- fruits) yield (f, f.length)
    for(e <- tuples_length) println(e)
    
    // Find fruits of length < 6
    val x = for (e <- fruits if e.length < 6) yield e.toUpperCase
    for(e <- x) println(e)
    
    
  }
}