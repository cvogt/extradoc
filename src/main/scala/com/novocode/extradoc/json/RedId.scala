package com.novocode.extradoc.json

import scala.tools.nsc.doc._
import model._
import comment._

final case class RefId[+E <: AnyRef](val e: E) extends Function0[E] {
  override def hashCode = System.identityHashCode(e)
  override def equals(o: Any) = o match {
    case RefId(e2) => e eq e2
    case _ => false
  }
  override def toString = "RefId("+e.toString+")"
  def apply() = e
}
