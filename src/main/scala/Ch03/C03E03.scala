package Ch03

object C03E03 {

  /**
    * C03E03
    * Using the same idea,
    * implement the function setHead for replacing the first element of a List with a different value.
    *
    * @param l
    * @param h
    * @return
    */
  def setHead[A](l: List[A], h: A): List[A] = l match {
    case Nil        => Cons(h, Nil)
    case Cons(_, t) => Cons(h, t)
  }
}
