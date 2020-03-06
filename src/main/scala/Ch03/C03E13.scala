package Ch03

/**
  * Can you write foldLeft in terms of foldRight?
  * How about the other way around?
  *
  * Implementing foldRight via foldLeft is useful because
  * it lets us implement foldRight tail-recursively,
  * which means it works even for large lists without overflow- ing the stack.
  */
object C03E13 {
  def foldLeft[A, B](l: List[A], z: B)(f: (B, A) => B): B = {
    Ch03.List.foldRight(l, z)((x, y) => f(y, x))
  }

  // def foldRight[A, B](l: List[A], z: B)(f: (A, B) => B): B =
}
