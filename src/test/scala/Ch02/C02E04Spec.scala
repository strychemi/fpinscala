package Ch02

import org.scalatest._

class C02E04Spec extends FunSpec with Matchers {
  describe("uncurry") {
    // test is kind of pointless because of type safety...
    // having it compile means that it should work as expected
    it("Int => Double => String should return (Int, Double) => String") {
      val result = C02E04.uncurry((a: Int) => (b: Double) => s"$a $b")
      result(1, 0.1) shouldBe "1 0.1"
    }
  }
}
