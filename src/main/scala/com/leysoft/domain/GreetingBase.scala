package com.leysoft.domain

class GreetingBase(val value: String) extends Greeting {

  override def name: String = value
}

object GreetingBase {

  def apply(value: String): GreetingBase = new GreetingBase(value)
}
