package Math

object FizzBuzz {
  def fizzBuzz(n: Int): List[String] = {
    (1 to n).map(current =>
      if (current % 15 == 0) "FizzBuzz"
      else if (current % 3 == 0) "Fizz"
      else if (current % 5 == 0) "Buzz"
      else current.toString
    ).toList
  }
}
