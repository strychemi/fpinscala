package Ch03

import C03E20.flatMap

object C03E21 {

  /**
    * Use flatMap to implement filter.
    *
    * @param as
    * @param f
    * @return
    */
  def filter[A](as: List[A])(f: A => Boolean): List[A] = {
    flatMap(as)(i => if (f(i)) List(i) else Nil)
  }
}
