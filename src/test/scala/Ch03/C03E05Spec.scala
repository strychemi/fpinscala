package Ch03

import org.scalatest._

class C03E05Spec extends FunSpec with Matchers {
  describe("dropWhile") {
    def isOdd(x: Int): Boolean = x % 2 == 1

    it("List(1, 3, 4), f => isOdd should yield List(4)") {
      C03E05.dropWhile(List(1, 3, 4), isOdd) should be(List(4))
    }

    it("List(), f => isOdd should yield List()") {
      C03E05.dropWhile(List(), isOdd) should be(List())
    }
  }
}
