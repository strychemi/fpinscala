import org.scalatest._

class C02E05Spec extends FunSpec with Matchers {
  describe("uncurry") {
    // test is kind of pointless because of type safety...
    // having it compile means that it should work as expected
    it("Int => Double => String should return (Int, Double) => String") {
      def f(b: Int): String = s"$b"
      def g(a: Int): Int = a + 1

      val result = C02E05.compose(f, g)
      result(1) shouldBe "2"
    }
  }
}
