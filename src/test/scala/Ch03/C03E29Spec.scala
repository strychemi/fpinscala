package Ch03

import org.scalatest._

class C03E29Spec extends FunSpec with Matchers {
  describe("size via fold") {
    it("Leaf(_) should be 1") {
      C03E29.size(Leaf("a")) should be(1)
    }
    it("Branch(Leaf(1), Leaf(2)) should be 3") {
      C03E29.size(Branch(Leaf(1), Leaf(2))) should be(3)
    }
  }

  describe("maximum via fold") {
    it("Leaf(7) should be 7") {
      C03E26.maximum(Leaf(7)) should be(7)
    }
    it("Branch(Leaf(1), Leaf(2)) should be 3") {
      C03E26.maximum(Branch(Leaf(3), Leaf(1))) should be(3)
    }
  }

  describe("depth via fold") {
    it("Leaf(7) should be 1") {
      C03E27.depth(Leaf(7)) should be(0)
    }
    it("Branch(Leaf(3), Branch(Leaf(1), Leaf(2))) should be 3") {
      C03E27.depth(Branch(Leaf(3), Branch(Leaf(1), Leaf(2)))) should be(2)
    }
  }

  describe("map via fold") {
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
