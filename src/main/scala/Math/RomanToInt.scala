package Math

object RomanToInt {
  def romanToInt(s: String): Int = {
    val array = s.toCharArray
    val myMap: Map[Char, Int] = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50)
    def helper(arr : Array[Char]): Int = arr match {
      case Array(a, b, t@_*) if(myMap(a) < myMap(b)) => myMap(b) - myMap(a) + helper(t.toArray)
      case Array(a, t@_*) => myMap(a) + helper(t.toArray)
      case _ => 0
    }
    helper(array)
  }
}
