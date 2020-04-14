package Ch03

import org.scalatest._

class C03E18Spec extends FunSpec with Matchers {
  describe("map") {
    it("List(1, 2, 3), times 0 should be List(0, 0, 0)") {
      C03E18.map(List(1, 2, 3))(x => x * 0) should be(List(0, 0, 0))
    }
  }
}
