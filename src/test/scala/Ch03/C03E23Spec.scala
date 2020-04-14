package Ch03

import org.scalatest._

class C03E23Spec extends FunSpec with Matchers {
  describe("zipWith") {
    it("List(1,2,3), List(4,5,6), (a, b) => a * b become List(5,7,9)") {
      C03E23.zipWith(List(1, 2, 3), List(4, 5, 6))(_ * _) should be(
        List(4, 10, 18)
      )
    }
  }
}
