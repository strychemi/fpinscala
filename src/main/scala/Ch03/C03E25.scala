package Ch03

object C03E25 {
  def size[A](tree: Tree[A]): Int = {
    tree match {
      case Leaf(value)         => 1
      case Branch(left, right) => 1 + size(left) + size(right)
    }
  }
}
