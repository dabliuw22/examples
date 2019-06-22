package com.leysoft

import com.leysoft.domain.{Country, GreetingBase}
import com.leysoft.service.base.GreetingServiceBase

object Main2 extends App {

  var country1 = Country(Some("Colombia"))
  country1.populations += ("Magangué" -> 100) += ("Santa Marta" -> 200) += ("Bogotá" -> 500)
  println(country1)
  println(s"AVG: ${Country.avg(country1.populations.values.toList)}")

  val greeting = GreetingBase("123")
  val greetingService = new GreetingServiceBase[GreetingBase]()
  var result: Option[Int] = greetingService.greeting(greeting)
  println(result)
  result = greetingService.greetingBasic(greeting)
  println(result)
}
