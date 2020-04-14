package Ch03

import List.{foldRight, map}
import C03E14.append
import C03E15.concat

object C03E20 {

  /**
    * Write a function flatMap that works like map except that the function
    * given will return a list instead of a single result,
    * and that list should be inserted into the final resulting list.
    *
    * @param as
    * @param f
    * @return
    */
  def flatMap[A, B](as: List[A])(f: A => List[B]): List[B] = {
    // approach 1
    // foldRight(as, Nil: List[B])((a, b) => append(f(a), b))

    // approach 2
    concat(map(as)(f))
  }
}
