package Ch03

import org.scalatest._

class C03E24Spec extends FunSpec with Matchers {
  describe("hasSubsequence") {
    it("List(1,2,3,4), List(2, 3) should be true") {
      C03E24.hasSubsequence(List(1, 2, 3, 4), List(2, 3)) should be(true)
    }

    it("List(1,2,3,4), List(4) should be true") {
      C03E24.hasSubsequence(List(1, 2, 3, 4), List(4)) should be(true)
    }

    it("List(1,2,3,4), Nil should be true") {
      C03E24.hasSubsequence(List(1, 2, 3, 4), Nil) should be(true)
    }

    it("List(1,2,3,4), List(5) should be false") {
      C03E24.hasSubsequence(List(1, 2, 3, 4), List(5)) should be(false)
    }

    it("List(1,2,3,4), List(2, 4) should be false") {
      C03E24.hasSubsequence(List(1, 2, 3, 4), List(4, 5)) should be(false)
    }
  }
}
