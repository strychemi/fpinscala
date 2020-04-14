package Ch03

object C03E22 {

  /**
    * Write a function that accepts two lists and constructs a new list
    * by adding corresponding elements.
    * For example, List(1,2,3) and List(4,5,6) become List(5,7,9).
    *
    * @param a
    * @param b
    * @return
    */
  def sumLists(a: List[Int], b: List[Int]): List[Int] = {
    (a, b) match {
      case (Cons(ah, at), Cons(bh, bt)) => Cons(ah + bh, sumLists(at, bt))
      case _                            => Nil
    }
  }
}
