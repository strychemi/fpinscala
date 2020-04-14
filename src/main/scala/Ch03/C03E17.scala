package Ch03

import List.foldRight

object C03E17 {

  /**
    * Write a function that turns each value in a List[Double] into a String.
    * You can use the expression d.toString to convert some d:
    * Double to a String.
    *
    * @param l
    * @return
    */
  def doubleToString(l: List[Double]): List[String] = {
    foldRight(l, Nil: List[String])((a, b) => Cons(a.toString, b))
  }
}
