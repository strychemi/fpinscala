package Ch03

// import the List singleton within Ch03 package for foldRight()
import List._

object C03E10 {

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
}
