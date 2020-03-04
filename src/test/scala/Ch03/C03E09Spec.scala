package Ch03

import org.scalatest._

class C03E09Spec extends FunSpec with Matchers {
  describe("length") {
    it("should be 3 for List(1, 2, 3)") {
      assert(C03E09.length(List(1, 2, 3)) === 3)
    }

    it("should be 0 for List()") {
      assert(C03E09.length(List()) === 0)
    }
  }
}
