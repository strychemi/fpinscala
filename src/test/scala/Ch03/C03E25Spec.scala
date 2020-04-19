package Ch03

import org.scalatest._

class C03E25Spec extends FunSpec with Matchers {
  describe("size") {
    it("Leaf(_) should be 1") {
      C03E25.size(Leaf("a")) should be(1)
    }
    it("Branch(Leaf(1), Leaf(2)) should be 3") {
      C03E25.size(Branch(Leaf(1), Leaf(2))) should be(3)
    }
  }
}
