package Ch03

import org.scalatest._

class C03E02Spec extends FunSpec with Matchers {
  describe("tail") {
    it("tail of List(1, 2, 3, 4, 5) should be List(2, 3, 4, 5)") {
      C03E02.tail(List(1, 2, 3, 4, 5)) should be(List(2, 3, 4, 5))
    }

    it("tail of List() should be Nil") {
      C03E02.tail(List()) should be(Nil)
    }
  }
}
