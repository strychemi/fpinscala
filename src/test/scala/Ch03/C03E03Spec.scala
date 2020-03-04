package Ch03

import org.scalatest._

class C03E03Spec extends FunSpec with Matchers {
  describe("setHead") {
    it("List(1, 2, 3), h = 666 should yield List(666, 2, 3)") {
      C03E03.setHead(List(1, 2, 3), 666) should be(List(666, 2, 3))
    }

    it("List(), h = 666 should yield List(666)") {
      C03E03.setHead(List(), 666) should be(List(666))
    }
  }
}
