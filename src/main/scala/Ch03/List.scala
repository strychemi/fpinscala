package Ch03

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = as match {
    case Nil         => z
    case Cons(x, xs) => f(x, foldRight(xs, z)(f))
  }

  // Curried implementations
  def sum(ns: List[Int]): Int = foldRight(ns, 0)(_ + _)

  /**
    * C03E09
    * Compute the length of a list using foldRight.
    *
    * @param l
    * @return
    */
  def length[A](as: List[A]): Int = foldRight(as, 0)((x, fn) => 1 + fn)

  /**
    * Our implementation of foldRight is not tail-recursive and
    * will result in a StackOver- flowError for large lists
    * (we say it’s not stack-safe). Convince yourself that this is the case,
    * and then write another general list-recursion function, foldLeft,
    * that is tail-recursive,
    * using the techniques we discussed in the previous chapter.
    *
    * @param l
    * @param z
    * @param f
    * @return
    */
  @annotation.tailrec
  def foldLeft[A, B](l: List[A], z: B)(f: (B, A) => B): B = l match {
    case Nil         => z
    case Cons(x, xs) => foldLeft(xs, f(z, x))(f)
  }

  // def map[A, B](l: List[A])(f: A => B): List[B] = ???
}
