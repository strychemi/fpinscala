package Ch03

import org.scalatest._

class C03E26Spec extends FunSpec with Matchers {
  describe("maximum") {
    it("Leaf(7) should be 7") {
      C03E26.maximum(Leaf(7)) should be(7)
    }
    it("Branch(Leaf(1), Leaf(2)) should be 3") {
      C03E26.maximum(Branch(Leaf(3), Leaf(1))) should be(3)
    }
  }
}
