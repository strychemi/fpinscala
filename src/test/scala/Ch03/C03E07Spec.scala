package Ch03

import org.scalatest._

class C03E07Spec extends FunSpec with Matchers {
  describe("product") {
    it("List(1, 2, 3) should be 6") {
      assert(C03E07.product(List(1, 2, 3)) === 6)
    }
  }
}
