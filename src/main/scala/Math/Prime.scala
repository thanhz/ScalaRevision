package Math

import scala.annotation.tailrec

object Prime {
    def isPrime(n: Int): Boolean = {
      @tailrec
      def helper(t:Int, isStillPrime: Boolean): Boolean = {
        if(!isStillPrime) false
        else if(t <= 1) true
        else helper(t-1, n % t != 0 && isStillPrime)
      }
      helper(n / 2, isStillPrime = true)
    }
}
