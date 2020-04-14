package Ch03

import List.foldRight

object C03E18 {

  /**
    * Write a function map that generalizes modifying each element in a list
    * while maintaining the structure of the list.
    *
    * @param as
    * @param f
    * @return
    */
  def map[A, B](as: List[A])(f: A => B): List[B] = {
    foldRight(as, Nil: List[B])((a, b) => Cons(f(a), b))
  }
}
