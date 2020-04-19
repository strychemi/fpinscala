package Ch03

import org.scalatest._

class C03E28Spec extends FunSpec with Matchers {
  describe("maximum") {
    it("Leaf(7) times 2 should be Leaf(14)") {
      C03E28.map(Leaf(7))(_ * 2) should be(Leaf(14))
    }
    it("Branch(Leaf(1), Leaf(2)) times 2 should be Branch(Leaf(2), Leaf(4))") {
      C03E28.map(Branch(Leaf(1), Leaf(2)))(_ * 2) should be(
        Branch(Leaf(2), Leaf(4))
      )
    }
  }
}
