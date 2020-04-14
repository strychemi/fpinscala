package Ch03

// import C03E10.foldLeft
import List.foldRight

object C03E14 {

  /**
    *
    * Implement append in terms of either foldLeft or foldRight.
    *
    * @param l
    * @param x
    * @return
    */
  def append[A, B](l: List[A], x: List[A]): List[A] = {
    foldRight(l, x)(Cons(_, _))
  }
}
