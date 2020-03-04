package Ch03

// import the List singleton within Ch03 package for foldRight()
import List._

object C03E09 {

  /**
    * C03E09
    * Compute the length of a list using foldRight.
    *
    * @param l
    * @return
    */
  def length[A](as: List[A]): Int = foldRight(as, 0)((x, fn) => 1 + fn)
}
