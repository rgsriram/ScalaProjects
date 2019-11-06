object QuickSort {
  def partition(array: Array[Int], low: Int, high: Int): Int = {
    val pivot = array(high)
    var i = low -1

    for (j <- low to high -1) {
      if (array(j) <= pivot) {
        i += 1
        val t = array(i)
        array(i) = array(j)
        array(j) = t
      }
    }

    val temp = array(i + 1)
    array(i+1) = array(high)
    array(high) = temp

    i + 1
  }

  def sort(array: Array[Int], low:Int, high:Int): Unit = {
    if (low < high) {
      val pi = partition(array, low, high);

      // Recursively sort elements before
      // partition and after partition
      sort(array, low, pi-1);
      sort(array, pi+1, high);
    }
  }

  def main(args: Array[String]) {
    val a = Array(3, 1, 2, 5, 6)
    sort(a, 0, a.length - 1)
    println(a.mkString(" "))
  }
}
