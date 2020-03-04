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

    describe("C03E03 - setHead") {
      it("List(1, 2, 3), h = 666 should yield List(666, 2, 3)") {
        List.setHead(List(1, 2, 3), 666) should be(List(666, 2, 3))
      }

      it("List(), h = 666 should yield List(666)") {
        List.setHead(List(), 666) should be(List(666))
      }
    }

    describe("C03E04 - drop") {
      it("List(1, 2, 3), n = -1 should yield List(1, 2, 3)") {
        List.drop(List(1, 2, 3), -1) should be(List(1, 2, 3))
      }

      it("List(1, 2, 3), n = 2 should yield List(3)") {
        List.drop(List(1, 2, 3), 2) should be(List(3))
      }

      it("List(1, 2, 3), n = 99 should yield Nil") {
        List.drop(List(1, 2, 3), 99) should be(Nil)
      }

      it("List(), n = 4 should yield List()") {
        List.drop(List(), 4) should be(Nil)
      }
    }

    describe("C0305 - dropWhile") {
      def isOdd(x: Int): Boolean = x % 2 == 1

      it("List(1, 3, 4), f => isOdd should yield List(4)") {
        List.dropWhile(List(1, 3, 4), isOdd) should be(List(4))
      }

      it("List(), f => isOdd should yield List()") {
        List.dropWhile(List(), isOdd) should be(List())
      }
    }

    describe("C03E06 - init") {
      it("List(1, 2, 3, 4) should yield List(1, 2, 3)") {
        List.init(List(1, 2, 3, 4)) should be(List(1, 2, 3))
      }

      it("List() should yield List()") {
        List.init(List()) should be(List())
      }
    }

    describe("C03E08") {
      it("Nil and Cons directly to foldRight gets back the original list") {
        List.foldRight(List(1, 2, 3), Nil: List[Int])(Cons(_, _)) should be(
          List(1, 2, 3)
        )
        List(1, 2, 3) should be(Cons(1, Cons(2, Cons(3, Nil))))
      }
    }

    describe("C03E09 - length") {
      it("should be 3 for List(1, 2, 3)") {
        assert(List.length(List(1, 2, 3)) === 3)
      }

      it("should be 0 for List()") {
        assert(List.length(List()) === 0)
      }
    }

    describe("C03E10 - foldLeft") {
      it("apply sum correctly") {
        assert(List.foldLeft(List(1, 2, 3), 0)(_ + _) === 6)
      }
    }
  }
}
