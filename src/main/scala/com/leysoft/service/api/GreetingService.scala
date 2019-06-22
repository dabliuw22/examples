package com.leysoft.service.api

import com.leysoft.domain.Greeting

trait GreetingService[-A <: Greeting] {

  val fun: (String => Int) = _.toInt

  def greeting(model: A): Option[Int]

  def greetingBasic(model: A): Option[Int]
}
