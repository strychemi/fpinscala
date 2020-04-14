package Ch03

import org.scalatest._

class C03E19Spec extends FunSpec with Matchers {
  describe("filter") {
    it("List(1, 2, 3) filter evens should be List(2)") {
      C03E19.filter(List(1, 2, 3))(x => x % 2 == 0) should be(
        List(2)
      )
    }
  }
}
