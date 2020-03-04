package Ch03

import org.scalatest._

class C03E08Spec extends FunSpec with Matchers {
  describe("foldRight exercise") {
    it("Nil and Cons directly to foldRight gets back the original list") {
      List.foldRight(List(1, 2, 3), Nil: List[Int])(Cons(_, _)) should be(
        List(1, 2, 3)
      )
      List(1, 2, 3) should be(Cons(1, Cons(2, Cons(3, Nil))))
    }
  }
}
