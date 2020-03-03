/**
  * What will be the result of the following match expression?
  */
object C03E01 {
  // import the custom List singleton to access its sum()
  import List._

  val x = List(1, 2, 3, 4, 5) match {
    // this is equivalent to List(x, 2, 4, _*),
    // so not a match because 2, and 3rd elements don't match
    case Cons(x, Cons(2, Cons(4, _))) => x
    // List(1, 2, 3, 4, 5) is not Nil
    case Nil => 42
    // this is the first case that pattern matches expression above
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    // this'll match, but the expression matches first
    case Cons(h, t) => h + sum(t)
    // this will always match, provided the none of the above matches first
    case _ => 101
  }
}

// code below is pasted from book to make above match expression run
sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil         => 0
    case Cons(x, xs) => x + sum(xs)
  }
  def product(ds: List[Double]): Double = ds match {
    case Nil          => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs)  => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}
