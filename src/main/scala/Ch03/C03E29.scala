package Ch03

object C03E29 {

  /**
    * Generalize size, maximum, depth, and map, writing a new function fold
    * that abstracts over their similarities.
    * Reimplement them in terms of this more general function.
    * Can you draw an analogy between this fold function and the left
    * and right folds for List?
    *
    * fold is anologous to foldRight, in that fold
    * accepts functions that handle each type (leaf & branch),
    * and recursively builds some value using these functions
    *
    * l is the fn that handles the leaf type.
    * This fn dictates how the base values are constructed to further build upon
    *
    * b is the fn that handles the branch type.
    * If you pass the branch constructor (as you see in map),
    * it'll reconstruct the tree structure.
    * Passing non-constructor fn's will produce a fn that will build
    * different values.
    *
    *
    * @param t
    * @param f
    * @return
    */
  def fold[A, B](t: Tree[A])(l: A => B)(b: (B, B) => B): B = {
    t match {
      case Leaf(value)         => l(value)
      case Branch(left, right) => b(fold(left)(l)(b), fold(right)(l)(b))
    }
  }

  def size[A](tree: Tree[A]): Int = {
    fold(tree)(leaf => 1)(1 + _ + _)
  }

  def maximum(tree: Tree[Int]): Int = {
    fold(tree)(leaf => leaf)(_ max _)
  }

  def depth[A](tree: Tree[A]): Int = {
    fold(tree)(leaf => 0)(1 + _ + _)
  }

  def map[A, B](tree: Tree[A])(f: A => B) = {
    fold(tree)(leaf => Leaf(f(leaf)): Tree[B])(Branch(_, _))
  }
}
