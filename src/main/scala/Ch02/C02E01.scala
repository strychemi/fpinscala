package Ch02

/**
  * Write a recursive function to get the nth Fibonacci number.
  * The first two Fibonacci numbers are 0 and 1.
  * The nth number is always the sum of the previous two—the sequence begins 0, 1, 1, 2, 3, 5.
  * Your definition should use a local tail-recursive function.
  */
object C02E01 {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def recurse(n: Int, a: Int = 0, b: Int = 1): Int = {
      n match {
        case n if n <= 1 => a
        case _           => recurse(n - 1, b, a + b)
      }
    }

    recurse(n)
  }
}
