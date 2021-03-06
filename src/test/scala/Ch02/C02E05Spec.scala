package Ch02

import org.scalatest._

class C02E05Spec extends FunSpec with Matchers {
  describe("compose") {
    def cube(b: Int): Int = b * b * b
    def addOne(a: Int): Int = a + 1

    it("should addOne then cube") {
      val result = C02E05.compose(addOne, cube)
      // (1 + 1) ^ 3
      result(1) shouldBe 8
    }

    it("should cube then addOne") {
      val result = C02E05.compose(cube, addOne)
      // 1 ^ 3 + 1
      result(1) shouldBe 2
    }
  }
}
