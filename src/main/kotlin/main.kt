
fun binarySearch(array: IntArray, l: Int, r: Int, element: Int): Int {
    var l = l
    var r = r
    var mid: Int
    while (l <= r) {
        mid = l + (r - l) / 2
        if (array[mid] == element)
            return mid
        else if (array[mid] < element)
            l = mid + 1
        else
            r = mid - 1
    }
    return -1
}
