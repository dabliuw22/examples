package com.leysoft

object Main {

  def main(args: Array[String]): Unit = {
    val double: (Int => Int) = _ * 2
    val print: (Any => Unit) = println(_)
    val f: Function[Any, Unit] = println(_)
    double.andThen(f(_)).apply(4)
    println()
    (1 to 10) foreach double.andThen(println)

    val f3: (Int => String) = _ match {
      case 1 => "One"
      case 2 => "two"
      case _ => "Default"
    }

    (1 to 10) foreach f3.andThen(f)
  }
}
