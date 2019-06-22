package com.leysoft.service.base

import com.leysoft.domain.Greeting
import com.leysoft.service.api.GreetingService

import scala.util.{Failure, Success, Try}

class GreetingServiceBase[-A <: Greeting] extends GreetingService[A]{

  override def greeting(model: A): Option[Int] = Try(fun(model.name)) match {
    case Success(value) => Some(value)
    case Failure(exception) => None
  }

  override def greetingBasic(model: A): Option[Int] = try {
    val v = fun(model.name)
    Some(v)
  } catch {
    case e: Exception => None
  }
}
