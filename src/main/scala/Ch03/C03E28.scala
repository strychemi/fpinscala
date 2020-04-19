package Ch03

object C03E28 {

  /**
    * Write a function map, analogous to the method of the same name on List,
    * that modifies each element in a tree with a given function.
    *
    * @param tree
    * @param f
    * @return
    */
  def map[A, B](tree: Tree[A])(f: A => B): Tree[B] = tree match {
    case Leaf(value)         => Leaf(f(value))
    case Branch(left, right) => Branch(map(left)(f), map(right)(f))
  }
}
