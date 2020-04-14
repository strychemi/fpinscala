package Ch03

import List.foldRight

object C03E16 {
  def addOne(l: List[Int]): List[Int] = {
    foldRight(l, Nil: List[Int])((a, b) => Cons(a + 1, b))
  }
}
