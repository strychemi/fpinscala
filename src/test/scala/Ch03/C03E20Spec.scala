package Ch03

import org.scalatest._

class C03E20Spec extends FunSpec with Matchers {
  describe("flatMap") {
    it(
      "flatMap(List(1,2,3))(i => List(i,i)) should result in List(1,1,2,2,3,3)"
    ) {
      C03E20.flatMap(List(1, 2, 3))(i => List(i, i)) should be(
        List(1, 1, 2, 2, 3, 3)
      )
    }
  }
}
