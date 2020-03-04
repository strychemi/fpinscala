package Ch03

import org.scalatest._

class C03E04Spec extends FunSpec with Matchers {
  describe("drop") {
    it("List(1, 2, 3), n = -1 should yield List(1, 2, 3)") {
      C03E04.drop(List(1, 2, 3), -1) should be(List(1, 2, 3))
    }

    it("List(1, 2, 3), n = 2 should yield List(3)") {
      C03E04.drop(List(1, 2, 3), 2) should be(List(3))
    }

    it("List(1, 2, 3), n = 99 should yield Nil") {
      C03E04.drop(List(1, 2, 3), 99) should be(Nil)
    }

    it("List(), n = 4 should yield List()") {
      C03E04.drop(List(), 4) should be(Nil)
    }
  }
}
