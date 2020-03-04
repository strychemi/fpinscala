package Ch03

import org.scalatest._

class C03E12Spec extends FunSpec with Matchers {
  describe("reverse") {
    it("List(1, 2, 3) should be List(3, 2, 1)") {
      C03E12.reverse(List(1, 2, 3)) should be(List(3, 2, 1))
    }

    it("List() should be List()") {
      C03E12.reverse(List()) should be(List())
    }
  }
}
