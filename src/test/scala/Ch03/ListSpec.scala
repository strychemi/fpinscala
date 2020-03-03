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
  }
}
