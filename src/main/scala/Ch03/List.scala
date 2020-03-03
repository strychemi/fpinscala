package Ch03

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil         => 0
    case Cons(x, xs) => x + sum(xs)
  }
  def product(ds: List[Double]): Double = ds match {
    case Nil          => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs)  => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  /**
    * C03E02
    * Implement the function tail for removing the first element of a List.
    * Note that the function takes constant time.
    * What are different choices you could make in your implementation if the List is Nil?
    * We’ll return to this question in the next chapter.
    * @param l
    * @return
    */
  def tail[A](l: List[A]): List[A] = l match {
    case Cons(head, tail) => tail
    case Nil              => Nil
  }

  // TODO: uncomment as needed for ch03 exercises
  // def setHead[A](l: List[A], h: A): List[A] = ???

  // def drop[A](l: List[A], n: Int): List[A] = ???

  // def dropWhile[A](l: List[A], f: A => Boolean): List[A] = ???

  // def init[A](l: List[A]): List[A] = ???

  // def length[A](l: List[A]): Int = ???

  // def foldLeft[A, B](l: List[A], z: B)(f: (B, A) => B): B = ???

  // def map[A, B](l: List[A])(f: A => B): List[B] = ???
}
