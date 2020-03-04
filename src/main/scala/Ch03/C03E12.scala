package Ch03

import C03E10._

object C03E12 {

  /**
    * Write a function that returns the reverse of a list
    * (given List(1,2,3) it returns List(3,2,1)).
    * See if you can write it using a fold.
    *
    * @param l
    * @return
    */
  def reverse[A](l: List[A]): List[A] =
    foldLeft(l, Nil: List[A])((a, b) => Cons(b, a))
}
