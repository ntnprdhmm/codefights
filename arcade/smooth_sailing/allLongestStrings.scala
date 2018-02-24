def stringsLengths(arr: Array[String]): Array[Int] = arr.map(_.length)

def stringOfLength(length: Int, strings: Array[String]): Array[String] =
  strings.filter(_.length == length)

def allLongestStrings(arr: Array[String]): Array[String] =
  stringOfLength(stringsLengths(arr).max, arr)
