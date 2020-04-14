package Ch03

import org.scalatest._

class C03E17Spec extends FunSpec with Matchers {
  describe("doubleToString") {
    it("List(1.0, 2.0, 3.0) should be List('1', '2', '3')") {
      C03E17.doubleToString(List(1.0, 2.0, 3.0)) should be(
        List("1.0", "2.0", "3.0")
      )
    }
  }
}
