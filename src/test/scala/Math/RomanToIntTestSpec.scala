package Math

import org.scalatest.flatspec.AnyFlatSpec
import Math.RomanToInt._

class RomanToIntTestSpec extends AnyFlatSpec{

  "RomanToInt" should "convert" in {
    val actual = romanToInt("III")
    val expected = (3)
    assert(actual == expected)
  }

  it should "correctly return difficult values like IV" in {
    val actual = romanToInt("IV")
    val expected = (4)
    assert(actual == expected)
  }
}
