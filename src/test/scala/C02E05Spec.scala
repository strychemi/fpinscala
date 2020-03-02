import org.scalatest._

class C02E05Spec extends FunSpec with Matchers {
  describe("compose") {
    def cube(b: Int): Int = b * b * b
    def addOne(a: Int): Int = a + 1

    it("should compose addOne then cube") {
      val result = C02E05.compose(cube, addOne)
      result(1) shouldBe 8
    }

    it("should cube then addOne") {
      val result = C02E05.compose(addOne, cube)
      result(1) shouldBe 2
    }
  }
}
