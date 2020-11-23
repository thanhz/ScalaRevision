package Math

import org.scalatest.flatspec.AnyFlatSpec

class FibonacciTestSpec extends AnyFlatSpec {

  "factorial" should "return correct factorial given nth input" in {
    //1,1,2,3,5,8,13,21
    val actual = Fibonacci.fibonacci(7)
    val expected = 13
    assert(actual == expected)
  }
  it should "return 1 when given nth is 0 or 1" in {
    val actual = Fibonacci.fibonacci(1)
    assert(actual == 1)
  }
}
