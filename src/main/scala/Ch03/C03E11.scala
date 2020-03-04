package Ch03

import C03E10._

object C03E11 {
  def sum(l: List[Int]) = foldLeft(l, 0)(_ + _)

  def product(l: List[Double]) = foldLeft(l, 1.0)(_ * _)

  def length[A](l: List[A]) = foldLeft(l, 0)((length, el) => length + 1)
}
