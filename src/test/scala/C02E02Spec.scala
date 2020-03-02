import org.scalatest._

class C02E02Spec extends FunSpec with Matchers with BeforeAndAfter {
  describe("isSorted") {
    describe("ordered = (a: Int, b: Int) => a <= b") {
      it("as = [1, 2, 3, 4, 5] should be true") {
        C02E02.isSorted((1 to 5).toArray, (a: Int, b: Int) => a <= b) shouldBe true
      }

      it("as = [1, 2, 3, 0, 4] should be false") {
        C02E02.isSorted(Array(1, 2, 3, 0, 4), (a: Int, b: Int) => a <= b) shouldBe false
      }
    }

    describe("ordered = (a: Char, b: Char) => a <= b") {
      it("as = ['a', 'b', 'c', 'd', 'e'] should be true") {
        C02E02.isSorted(('a' to 'e').toArray, (a: Char, b: Char) => a <= b) shouldBe true
      }
      it("as = ['a', 'b', 'c', 'a', 'd'] should be false") {
        C02E02.isSorted(
          Array('a', 'b', 'c', 'a', 'd'),
          (a: Char, b: Char) => a <= b
        ) shouldBe false
      }
    }
  }
}
