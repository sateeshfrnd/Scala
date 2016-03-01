package com.satish.workshop.scala.collections

/**
 * @author satish
 * 
 * Vector is the recommended class for immutable, sequential collections.
 */
object VectorDemo {
  def main(arg: Array[String]) {

    val vector = Vector(1, 2, 3, 4, 5)
    println("Sum = " + vector.sum)

    println("Get the element at index 2 = " + vector(2))

    val filterEven = vector.filter { x => (x % 2 == 0) }
    println("filter all Evens = " + filterEven)
    println(vector filter { _ % 2 == 0 })

    println("vector.map { x => (x * 2) } = " + vector.map { x => (x * 2) })
    println("vector.map { _ *2 } = " + vector.map { _ * 2 })

    // If you create an instance of an IndexedSeq, Scala returns a Vector
    val x = IndexedSeq(1, 2, 3)
    println(x.indexOf(2))

    println("head = " + (vector head))
    println("tail = " + (vector tail))
    println("take 2 = " + (vector take 2))
    println("take while = " + (vector takeWhile { x => (x < 3) }))

    // Returns a new collection with the element '6' appended to the Vector 'vector'.
    val newVector = vector :+ 6;
    println("newVector = " + newVector)

    // Returns a new collection with the element e prepended to the collection c.
    val vector_pre = 6 +: vector;
    println("vector_pre = " + vector_pre)
    
    // Add elements
    var vector1 = Vector(1,2,3,4)
    vector1 = vector1 ++ Vector(5,6)
    println("Add elements from Vector = "+vector1)

    // Create a new Vector from existing Vector and add elements to it.
    val vector2 = vector ++ Vector(6,7,8)
    println("Create Vector from existing = "+vector2)
    
    // Update element in exiting and assign to new object
    val vector3 = vector.updated(0, 10)
    println("Update element in exiting = "+vector3)
    
    // Looping over a Vector with foreach
    vector3.foreach { x => print(x+"\t") }
    vector3.foreach { println(_) }
    vector3.foreach(println)
    
    case class Person (name: String)
    val friends = Vector("Satish", "Teja", "Ramya")
    val persons = for (f <- friends) yield Person(f)
    println(persons)
    
    val findPersons_startWith_S = for {
      p <- persons
      if(p.name.startsWith("S"))
    } yield p
    
    println("findPersons_startWith_S = "+findPersons_startWith_S)
    
    
    // Transforming to Another with map
    val cars = Vector("Mercedes", "Porsche", "Tesla")
    println("cars = "+cars)
    
    val car_caps =  cars.map { x => x.toUpperCase() }
    println("car_caps = "+car_caps)
    

  }
}