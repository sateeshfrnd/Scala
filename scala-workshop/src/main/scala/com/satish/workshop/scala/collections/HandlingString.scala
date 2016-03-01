package com.satish.workshop.scala.collections

/**
 * @author satish
 */
object HandlingString {
  def main(arg: Array[String]) {
    val s = " eggs, milk, butter, Coco Puffs "
    val items = s.split(",").map { _.trim }
    for(e <- items)println(e)
  }
}