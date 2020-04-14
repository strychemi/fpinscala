package Ch03

import org.scalatest._

class C03E22Spec extends FunSpec with Matchers {
  describe("sumLists") {
    it("List(1,2,3) and List(4,5,6) become List(5,7,9)") {
      C03E22.sumLists(List(1, 2, 3), List(4, 5, 6)) should be(
        List(5, 7, 9)
      )
    }
  }
}
