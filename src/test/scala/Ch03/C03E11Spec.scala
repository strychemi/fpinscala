package Ch03

import org.scalatest._

class C03E11Spec extends FunSpec with Matchers {
  describe("sum") {
    it("List(1, 2, 3) should be 6") {
      assert(C03E11.sum(List(1, 2, 3)) === 6)
    }

    it("List() should be 0") {
      assert(C03E11.sum(List()) === 0)
    }
  }

  describe("product") {
    it("List(1, 2, 3) should be 6") {
      assert(C03E11.product(List(1, 2, 3)) === 6)
    }

    it("List() should be 1") {
      assert(C03E11.product(List()) === 1)
    }
  }

  describe("length") {
    it("List(1, 2, 3) should be 6") {
      assert(C03E11.length(List(1, 2, 3)) === 3)
    }

    it("List() should be 1") {
      assert(C03E11.length(List()) === 0)
    }
  }
}
