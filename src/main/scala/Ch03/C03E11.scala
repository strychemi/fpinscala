package Ch03

import C03E10._

/**
  * Write sum, product, and a function to compute the length of a list using foldLeft.
  */
object C03E11 {
  def sum(l: List[Int]): Int = foldLeft(l, 0)(_ + _)

  def product(l: List[Double]): Double = foldLeft(l, 1.0)(_ * _)

  def length[A](l: List[A]): Int = foldLeft(l, 0)((length, el) => length + 1)
}
