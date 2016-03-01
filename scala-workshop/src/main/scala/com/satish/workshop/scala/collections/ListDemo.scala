package com.satish.workshop.scala.collections

/**
 * @author satish
 */
object ListDemo {
  def main(arg: Array[String]) {

    val list = List.range(1, 10)
    println(list)

    //    val evenNumbers = list.filter { _ % 2 == 0}
    val evenNumbers = list.filter { x => (x % 2 == 0) }
    println(evenNumbers)

    println("filter = " + (list filter { _ % 2 == 0 }))
    println("head = " + (list head))
    println("tail = " + (list tail))
    println("take 2 = " + (list take 2))
    println("take while = " + (list takeWhile { x => (x < 3) }))

    // Returns a new collection with the element '6' appended to the list 'list'.
    val newlist = list :+ 6;
    println("newlist = " + newlist)

    // Returns a new collection with the element e prepended to the collection c.
    val list_pre = 6 +: list;
    println("list_pre = " + list_pre)
    // Returns a List with the element e prepended to the List named list. (:: works only on List.)
    val newList = 17 :: list;
    println("newList = " + newList)

    // Declaring a Type When Creating
    val numbers = List[Number](1, 2.0, 3D, 400L)
    println("numbers = " + numbers)

    val listAny = List[AnyVal](1, 2.0, 33D, 400L, 'c')
    println("listAny = " + listAny)

    // Looping over a List with a for Loop
    val fruits = Traversable("apple", "banana", "orange")
    for (e <- fruits) print(e + "\t")
    for (e <- fruits) {
      val uppeecase = e.toUpperCase
      print(uppeecase + "\t")
    }
    println()
    for (e <- fruits) print(e.toUpperCase() + "\t")
    println()

    // Using a counter inside a for loop
    //    for (i <- 0 until fruits.size) println(s"element[$i] : ${fruits(i)} ")

    // for/yield
    val listUpperCase = for (e <- fruits) yield e.toUpperCase
    println("listUpperCase = " + listUpperCase)

    // ============== zipWithIndex =================
    val days = "Sunday" ::  "Monday" ::  "Tuesday" ::  "Wednesday" ::  "Thursday" ::  "Friday" :: "Saturday" :: Nil
    println("days = " + days)

    val zwiList = days.zipWithIndex
    println("zwiList = " + zwiList)

    days.zipWithIndex.foreach { d =>
      println(s"${d._2} is ${d._1}")
    }
   
    val fruits_days_List = List(fruits, days)
    println(fruits_days_List)
  }
}