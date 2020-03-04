package Ch03

object C03E02 {

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
}
