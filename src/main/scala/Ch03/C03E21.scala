package Ch03

import C03E20.flatMap

object C03E21 {

  def filter[A](as: List[A])(f: A => Boolean): List[A] = {
    flatMap(as)(i => if (f(i)) List(i) else Nil)
  }
}
