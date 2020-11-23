package Math

object Factorial{

  def factorial(n: Int): Int = {
    if (n <= 2) 1
    else n * factorial(n - 1)
  }
}
