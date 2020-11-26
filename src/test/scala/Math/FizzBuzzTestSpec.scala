package Math

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.contain
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class FizzBuzzTestSpec extends AnyFlatSpec {

  "FizzBuzz" should "return Fizz if multiple of 3, buzz if multiple of 5 and fizzbuzz for both" in {
    val actual = FizzBuzz.fizzBuzz(15)
    actual should contain theSameElementsInOrderAs List("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
  }
}
