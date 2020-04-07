package Ch03

import org.scalatest._

class C03E13Spec extends FunSpec with Matchers {
  describe("foldLeft in terms of foldRight") {
    it("List(1,2,3) & reverse should work") {
      C03E13.foldLeft(List(1, 2, 3), Nil: List[Int])((a: List[Int], b: Int) =>
        Cons(b, a)
      ) should be(
        List(3, 2, 1)
      )
    }

    it("sum should work") {
      assert(C03E13.foldLeft(List(1, 2, 3), 0)(_ + _) === 6)
    }

    it("product should work") {
      assert(C03E13.foldLeft(List(1, 2, 3), 1.0)(_ * _) === 6.0)
    }
  }

  describe("foldRight in terms of foldLeft") {
    it("List(1,2,3), Nil for z, and Cons for fn should return List(1, 2, 3)") {
      C03E13.foldRight(List(1, 2, 3), Nil: List[Int])((a: Int, b: List[Int]) =>
        Cons(a, b)
      ) should be(
        List(1, 2, 3)
      )
    }

    it("sum should work") {
      assert(C03E13.foldRight(List(1, 2, 3), 0)(_ + _) === 6)
    }

    it("product should work") {
      assert(C03E13.foldRight(List(1, 2, 3), 1.0)(_ * _) === 6.0)
    }
  }
}
