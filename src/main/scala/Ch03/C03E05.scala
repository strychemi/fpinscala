package Ch03

object C03E05 {

  /**
    * C03E05
    * Implement dropWhile, which removes elements from the List prefix as long as they match a predicate.
    *
    * @param l
    * @param f
    * @return
    */
  @annotation.tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Cons(h, t) if f(h) => dropWhile(t, f)
    case _                  => l
  }
}
