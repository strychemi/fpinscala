package Ch02

/**
  * Implement the higher-order function that composes two functions.
  */
object C02E05 {
  def compose[A, B, C](f: A => B, g: B => C): A => C = a => g(f(a))
}
