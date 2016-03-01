package com.satish.workshop.scala.collections

/**
 * @author satish
 */
object MapDemo {
   def main(arg: Array[String]) {
     
    // ######### Methods for immutable maps #########
    val immutableMap = Map(1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four", 5 -> "Five", 6 -> "Six")
    println("Map = " + immutableMap)

    //(m - k) : Returns a map with the key k (and its corresponding value) removed.
    val mapWithoutKey2 = immutableMap - 2;
    println("mapWithoutKey2 = " + mapWithoutKey2)

    // m - (k1, k2, k3) Returns a map with the keys k1, k2, and k3 removed.
    println("map - (1,3,5) = " + (immutableMap - (1, 3, 5)))

    val list = List(1, 2)
    println("list = " + list)
    val removeElementsFromCollection = immutableMap -- list
    println("removeElementsFromCollection = " + removeElementsFromCollection)

    // ######### Methods for Mutable maps #########
    val mutableMap = collection.mutable.Map(1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four", 5 -> "Five", 6 -> "Six")
    println("Map = " + mutableMap)
    
    //(m - k) : Returns a map with the key k (and its corresponding value) removed.
    val mutableMapWithoutKey2 = mutableMap - 2;
    println("mutableMapWithoutKey2 = "+mutableMapWithoutKey2)
    
    // m - (k1, k2, k3) Returns a map with the keys k1, k2, and k3 removed.
    println("map - (1,3,5) = "+(mutableMap - (1,3,5)))
    
    println("list = "+list)
    val removeElementsFromCollectionInMap = mutableMap -- list
    println("removeElementsFromCollectionInMap = "+removeElementsFromCollectionInMap)
    
    println("====== Add Element to Map =========")
    mutableMap += (7 -> "seven")
    println("Added Element 7 = "+mutableMap)
    
    mutableMap += (8 -> "Eight", 9 -> "Nine")
    println("Added Element 8,9 to Existing map = "+mutableMap)
    
    val listOfTuples = List((10 -> "Ten"), (11,"Eleven"))
    println("listOfTuples = "+listOfTuples)
    
    //Add the elements in the List to the mutable map mm.
    mutableMap ++= listOfTuples
    println("Added Element from List to Existing map = "+mutableMap)
    
    println("====== Remove Element to Map =========")
    println("Remove Key '11' from map = "+ (mutableMap -= 11))
    println("Remove Key '10', '9' from map = "+ (mutableMap -= (10,9)))

    println("====== Filter Elements from Mutable Map =========")
    // Filter the elements in a map using the retain method to specify which elements should be retained
//    println("Filter elements that key is >2 : = "+(mutableMap retain((k,v) => k > 6)))

      // Looping over a Map with foreach
    println("Loop over map mutableMap = "+mutableMap)
    mutableMap foreach(entry => println(s"${entry._1} -> ${entry._2}"))
    
    // Looping over a Map with for
    println("Looping over a Map with for")
    for ((k,v) <- mutableMap) println(s"key : $k, Value : $v")
    
    
    // ######### Methods for Mutable & Immutable maps #########
    // Returns the value associated with the key k.
    println("mutableMap(3) = "+mutableMap(3))
    
    // Returns the value associated with key k in map as an option, None if not found.
    println(mutableMap get 1)
    
    println("Check Map Contains Key : mutableMap contains(4) = "+(mutableMap contains 4))
    
    println("============ Transform ===============")
    println("Transform mutableMap Values = "+(mutableMap.transform((k,v) => v.toUpperCase)))
    println("Transform immutableMap Values = "+(immutableMap.transform((k,v) => v.toUpperCase)))
        
    println("============ Get Keys ===============")
   
//       println(mutableMap filter((k,v) => k > 6))
  }
}