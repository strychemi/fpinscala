package Ch02

import org.scalatest._

class C02E01Spec extends FunSpec with Matchers {
  describe("fib") {
    it("fib(1) should equal 0") {
      assert(C02E01.fib(1) === 0)
    }

    it("fib(2) should equal 1") {
      assert(C02E01.fib(2) === 1)
    }

    it("fib(3) to fib(7) should yield 1, 2, 3, 5, 8, respectively") {
      val fibSequence = for (n <- 3 to 7) yield C02E01.fib(n)
      fibSequence shouldBe List(1, 2, 3, 5, 8)
    }

    it("fib(-666) should equal 0, disregard bad inputs") {
      assert(C02E01.fib(-666) === 0)
    }
  }
}
