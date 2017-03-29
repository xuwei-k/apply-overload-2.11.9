package example

import org.scalacheck.{Arbitrary, Gen}

case class Foo[A](x: Option[Int], y: A)

object Foo {
  // error
  implicit def arbitrary[A](implicit a: Arbitrary[A]): Arbitrary[Foo[A]] =
    Arbitrary(Gen.resultOf[Option[Int], A, Foo[A]](Foo.apply[A]))

  def apply[A](x: Int, y: A): Foo[A] = Foo(Some(x), y)
}


case class Bar[A](x: Option[Int], y: A)

object Bar {
  def apply[A](x: Int, y: A): Bar[A] = Bar(Some(x), y)

  // ok
  implicit def arbitrary[A](implicit a: Arbitrary[A]): Arbitrary[Bar[A]] =
    Arbitrary(Gen.resultOf[Option[Int], A, Bar[A]](Bar.apply[A]))
}
