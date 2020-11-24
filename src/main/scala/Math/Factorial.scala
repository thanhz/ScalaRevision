package Math

import scala.annotation.tailrec

object Factorial {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  def factorialTailRec(n: Int): Int = {
    @tailrec
    def accumulator(n: Int, acc: Int): Int = {
      if (n <= 1) acc
      else accumulator(n - 1, n * acc)
    }

    accumulator(n, 1)
  }
}
