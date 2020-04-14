package Ch03

import C03E10.foldLeft
import C03E14.append

object C03E15 {

  /**
    * Hard: Write a function that concatenates a list of lists into
    * a single list.
    * Its runtime should be linear in the total length of all lists.
    * Try to use functions we have already defined.
    *
    * @param l
    * @return
    */
  def flatten[A](l: List[List[A]]): List[A] = {
    foldLeft(l, Nil: List[A])((b, a) => append(b, a))
  }
}
