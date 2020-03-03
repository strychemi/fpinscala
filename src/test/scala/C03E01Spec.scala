import org.scalatest._

class C03E01Spec extends FunSpec with Matchers {
  describe("match expression") {
    it("should be 3") {
      val result = C03E01.x
      assert(result === 3)
    }
  }
}
