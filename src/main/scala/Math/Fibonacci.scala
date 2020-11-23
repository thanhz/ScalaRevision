package Math

import scala.annotation.tailrec

object Fibonacci {
  def fibonacci(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  //Recursion only works well if n is small, otherwise you get a stack overflow exception. One way to overcome this problem is to use tail recursion
  def fibTailRec(n: Int): Int = {
    @tailrec
    def fib_tail(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => fib_tail(n - 1, b, a + b)
    }

    fib_tail(n, 0, 1)
  }
}
