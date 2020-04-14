package Ch03

import List.foldRight

object C03E19 {

  /**
    * Write a function filter that removes elements from a list unless
    * they satisfy a given predicate.
    * Use it to remove all odd numbers from a List[Int].
    *
    * @param as
    * @param f
    * @return
    */
  def filter[A](as: List[A])(f: A => Boolean): List[A] = {
    foldRight(as, Nil: List[A])((a, b) => if (f(a)) Cons(a, b) else b)
  }
}
