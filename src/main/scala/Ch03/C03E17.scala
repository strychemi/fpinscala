package Ch03

import List.foldRight

object C03E17 {
  def doubleToString(l: List[Double]): List[String] = {
    foldRight(l, Nil: List[String])((a, b) => Cons(a.toString, b))
  }
}
