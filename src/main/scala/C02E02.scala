/**
  * Implement isSorted, which checks whether an Array[A] is sorted according to a given comparison function:
  */
object C02E02 {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int, flag: Boolean = true): Boolean = (n, flag) match {
      case (_, flag) if flag == false   => false
      case (n, _) if n >= as.length - 1 => flag
      case _                            => loop(n + 1, ordered(as(n), as(n + 1)))
    }

    loop(0)
  }
}
