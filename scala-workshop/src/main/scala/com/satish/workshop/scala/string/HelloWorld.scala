package com.satish.workshop.scala.string

object HelloWorld {
  def main(arg:Array[String]){
    val hello = "Hello... Welcome to Scala Programming."
    val border = "-" * hello.length + "--\n"
    println(border + hello + "\n" + border)
  }
}