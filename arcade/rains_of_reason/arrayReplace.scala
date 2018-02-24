def arrayReplace(arr: Array[Int], elemToReplace: Int, substitutionElem: Int): Array[Int] = {
    arr.map(e => if (e == elemToReplace) substitutionElem else e)
}
