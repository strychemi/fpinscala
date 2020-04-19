package Ch03

object C03E26 {

  /**
    * Write a function maximum that returns the maximum element in a Tree[Int].
    * (Note: In Scala, you can use x.max(y) or x max y to compute
    * the maximum of two integers x andy.)
    *
    * @param tree
    * @return
    */
  def maximum(tree: Tree[Int]): Int = tree match {
    case Leaf(value)         => value
    case Branch(left, right) => maximum(left) max maximum(right)
  }
}
