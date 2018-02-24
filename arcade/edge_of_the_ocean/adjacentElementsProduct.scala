def adjacentPairProducts(arr: Array[Int]) =
  for (i <- 0 to arr.length-2) yield arr(i)*arr(i+1)

def adjacentElementsProduct(arr: Array[Int]): Int = {
  adjacentPairProducts(arr).max
}
