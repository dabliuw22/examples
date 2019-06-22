package com.leysoft.domain

import scala.collection.immutable.List

case class Country(name: Option[String], var populations: scala.collection.mutable.Map[String, Int]) {

  def this(name: Option[String]) = this(name, scala.collection.mutable.Map[String, Int]())

  def this() = this(None, scala.collection.mutable.Map[String, Int]())

  def getPopulation(city: String) = populations(city)

  override def toString: String = s"Country(name = $name, populations = $populations)"
}

object Country {

  // Para no usar el new en el constructor Country(name)
  def apply(name: Option[String]): Country = new Country(name)

  def apply: Country = new Country

  def avg(values: List[Int]) = values.sum / values.length
}
