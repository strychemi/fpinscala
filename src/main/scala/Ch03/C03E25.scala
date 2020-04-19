package Ch03

object C03E25 {

  /**
    * Write a function size that counts the number of nodes
    * (leaves and branches) in a tree.
    *
    * @param tree
    * @return
    */
  def size[A](tree: Tree[A]): Int = {
    tree match {
      case Leaf(_)             => 1
      case Branch(left, right) => 1 + size(left) + size(right)
    }
  }
}
