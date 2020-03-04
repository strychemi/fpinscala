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
    *
    * @param l
    * @return
    */
  def tail[A](l: List[A]): List[A] = l match {
    case Cons(head, tail) => tail
    case Nil              => Nil
  }

  /**
    * C03E03
    * Using the same idea,
    * implement the function setHead for replacing the first element of a List with a different value.
    *
    * @param l
    * @param h
    * @return
    */
  def setHead[A](l: List[A], h: A): List[A] = l match {
    case Nil        => Cons(h, Nil)
    case Cons(_, t) => Cons(h, t)
  }

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

  /**
    * C03E05
    * Implement dropWhile, which removes elements from the List prefix as long as they match a predicate.
    *
    * @param l
    * @param f
    * @return
    */
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Cons(h, t) if f(h) => dropWhile(t, f)
    case _                  => l
  }

  // for below exercise
  def append[A](a1: List[A], a2: List[A]): List[A] =
    a1 match {
      case Nil        => a2
      case Cons(h, t) => Cons(h, append(t, a2))
    }

  /**
    * C03E06
    * Not everything works out so nicely.
    * Implement a function, init,
    * that returns a List consisting of all but the last element of a List.
    * So, given List(1,2,3,4),
    * init will return List(1,2,3).
    * Why can’t this function be implemented in constant time like tail?
    *
    * @param l
    * @return
    */
  def init[A](l: List[A]): List[A] = l match {
    case Nil          => Nil
    case Cons(_, Nil) => Nil
    case Cons(h, t)   => Cons(h, init(t))
  }

  // def length[A](l: List[A]): Int = ???

  // def foldLeft[A, B](l: List[A], z: B)(f: (B, A) => B): B = ???

  // def map[A, B](l: List[A])(f: A => B): List[B] = ???
}
