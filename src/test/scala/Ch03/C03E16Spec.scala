package Ch03

import org.scalatest._

class C03E16Spec extends FunSpec with Matchers {
  describe("addOne") {
    it("List(1, 2, 3) should be List(2, 3, 4)") {
      C03E16.addOne(List(1, 2, 3)) should be(
        List(2, 3, 4)
      )
    }
  }
}
