package Ch03

import org.scalatest._

class C03E10Spec extends FunSpec with Matchers {
  describe("foldLeft") {
    it("apply sum correctly") {
      assert(C03E10.foldLeft(List(1, 2, 3), 0)(_ + _) === 6)
    }
  }
}
