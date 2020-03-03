package Ch03

import org.scalatest._

class ListSpec extends FunSpec with Matchers {
  describe("List") {
    describe("C03E02 - tail") {
      it("tail of List(1, 2, 3, 4, 5) should be List(2, 3, 4, 5)") {
        List.tail(List(1, 2, 3, 4, 5)) should be(List(2, 3, 4, 5))
      }

      it("tail of List() should be Nil") {
        List.tail(List()) should be(Nil)
      }
    }

    describe("C03E03 - setHead") {
      it("List(1, 2, 3), h = 666 should yield List(666, 2, 3)") {
        List.setHead(List(1, 2, 3), 666) should be(List(666, 2, 3))
      }

      it("List(), h = 666 should yield List(666)") {
        List.setHead(List(), 666) should be(List(666))
      }
    }
  }
}
