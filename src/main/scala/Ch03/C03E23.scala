package Ch03

import List.foldRight

object C03E23 {

  /**
    * Generalize the function you just wrote so that it’s not specific to
    * integers or addition. Name your generalized function zipWith.
    *
    * @param a
    * @param b
    * @param f
    * @return
    */
  def zipWith[A](a: List[A], b: List[A])(f: (A, A) => A): List[A] = {
    (a, b) match {
      case (Cons(ah, at), Cons(bh, bt)) => Cons(f(ah, bh), zipWith(at, bt)(f))
      case _                            => Nil
    }
  }
}
