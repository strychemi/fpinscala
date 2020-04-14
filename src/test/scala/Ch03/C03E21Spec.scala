package Ch03

import org.scalatest._

class C03E21Spec extends FunSpec with Matchers {
  describe("filter via flatMap") {
    it("List(1, 2, 3) filter evens should be List(2)") {
      C03E21.filter(List(1, 2, 3))(x => x % 2 == 0) should be(
        List(2)
      )
    }
  }
}
