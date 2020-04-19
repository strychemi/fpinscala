package Ch03

object C03E27 {

  /**
    * Write a function depth that returns the maximum path length
    * from the root of a tree to any leaf.
    *
    * @param tree
    * @return
    */
  def depth[A](tree: Tree[A]): Int = tree match {
    case Leaf(_)             => 0
    case Branch(left, right) => 1 + (depth(left) max depth(right))
  }
}
