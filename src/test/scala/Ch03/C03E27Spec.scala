package Ch03

import org.scalatest._

class C03E27Spec extends FunSpec with Matchers {
  describe("maximum") {
    it("Leaf(7) should be 1") {
      C03E27.depth(Leaf(7)) should be(0)
    }
    it("Branch(Leaf(3), Branch(Leaf(1), Leaf(2))) should be 3") {
      C03E27.depth(Branch(Leaf(3), Branch(Leaf(1), Leaf(2)))) should be(2)
    }
  }
}
