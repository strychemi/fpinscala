package Ch03

// import this for the tail() method
import C03E02._

object C03E04 {

  /**
    * C03E04
    * Generalize tail to the function drop,
    * which removes the first n elements from a list.
    * Note that this function takes time proportional only to the number of elements being dropped—we don’t need to make a copy of the entire List.
    *
    * @param l
    * @param n
    * @return
    */
  @annotation.tailrec
  def drop[A](l: List[A], n: Int): List[A] = (l, n) match {
    case (_, n) if n < 0 => l // case for when n is negative
    case (Nil, _)        => Nil // n doesn't matter if list is already Nil
    case (l, 0)          => l // base case
    case _               => drop(tail(l), n - 1)
  }
}
