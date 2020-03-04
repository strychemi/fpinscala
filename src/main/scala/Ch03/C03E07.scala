package Ch03

// import the List singleton within Ch03 package for foldRight()
import List._

object C03E07 {

  /**
    * C03E07
    * Can product, implemented using foldRight,
    * immediately halt the recursion and return 0.0 if it encounters a 0.0?
    * Why or why not? Consider how any short-circuiting might work if you call foldRight with a large list.
    * This is a deeper question that we’ll return to in chapter 5.
    *
    * @param ns
    * @return
    */
  // no, it won't short circuit because there's no check on the local values
  // before the callback function f is called
  def product(ns: List[Double]): Double = foldRight(ns, 1.0)(_ * _)
}
