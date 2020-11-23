package Math

import org.scalatest.flatspec.AnyFlatSpec

class FactorialTestSpec extends AnyFlatSpec {

  "factorial" should "return correct factorial given nth input" in {
    val actual = Factorial.factorial(5)
    val expected = 120
    assert(actual == expected)
  }
  it should "return 1 when given nth less than or equal to 1" in {
    val actual = Factorial.factorial(1)
    assert(actual == 1)
  }
}
