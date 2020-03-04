package Ch03

import org.scalatest._

class C03E06Spec extends FunSpec with Matchers {
  describe("init") {
    it("List(1, 2, 3, 4) should yield List(1, 2, 3)") {
      C03E06.init(List(1, 2, 3, 4)) should be(List(1, 2, 3))
    }

    it("List() should yield List()") {
      C03E06.init(List()) should be(List())
    }
  }
}
