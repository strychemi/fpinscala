package Ch03

import org.scalatest._

class C03E14Spec extends FunSpec with Matchers {
  describe("append via foldLeft") {
    it("List(1,2,3) & List(4) should be List(1, 2, 3, 4)") {
      C03E14.append(List(1, 2, 3), List(4)) should be(List(1, 2, 3, 4))
    }
  }
}
