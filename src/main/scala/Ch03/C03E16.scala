package Ch03

import List.foldRight

object C03E16 {

  /**
    * Write a function that transforms a list of integers by
    * adding 1 to each element.
    * (Reminder: this should be a pure function that returns a new List!)
    *
    * @param l
    * @return
    */
  def addOne(l: List[Int]): List[Int] = {
    foldRight(l, Nil: List[Int])((a, b) => Cons(a + 1, b))
  }
}
