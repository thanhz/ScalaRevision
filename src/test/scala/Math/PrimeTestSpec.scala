package Math

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class PrimeTestSpec extends AnyFlatSpec {

  "Prime" should "return true if number is a prime number" in {
    val actual = Prime.isPrime(5)
    actual shouldBe true
  }

  it should "return false if number isn't a prime number" in {
    val actual = Prime.isPrime(6)
    actual shouldBe false
  }
}
