package Ch03

import org.scalatest._

class C03E15Spec extends FunSpec with Matchers {
  describe("concat, takes a list of lists to single list") {
    it("List(List(1), List(2, 3), List(4)) should be List(1, 2, 3, 4)") {
      C03E15.concat(List(List(1), List(2, 3), List(4))) should be(
        List(1, 2, 3, 4)
      )
    }
  }
}
