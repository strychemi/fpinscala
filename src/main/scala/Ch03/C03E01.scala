package Ch03

/**
  * What will be the result of the following match expression?
  */
object C03E01 {
  // import the custom List singleton to access its sum()
  import Ch03.List._

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
