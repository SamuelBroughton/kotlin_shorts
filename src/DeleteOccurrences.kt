/*
    Kata
    ====

    Delete occurrences of an element if it occurs more than n times
    JustyFY

    Task
    ====

    Given a list lst and a number N, create a new list that contains each number
    of lst at most N times without reordering. For example if N = 2, and the input
    is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would
    lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].

    Example
    =======

    delete_nth({1, 1, 1, 1}, 4, 2, out) // out = {1, 1}, return 2
    delete_nth({20, 37, 20, 21}, 4, 1, out) // out = {20, 37, 21}, return 3
 */
fun deleteOccurrences(elements: IntArray, maxOccurrences: Int): IntArray {
    if (maxOccurrences < 1) return intArrayOf()
    val elementCountsMap = HashMap<Int, Int>()
    val newElements = mutableListOf<Int>()
    for (n in elements) {
        if (n in elementCountsMap.keys) {
            elementCountsMap[n] = elementCountsMap.getValue(n) + 1
            if (elementCountsMap.getValue(n) <= maxOccurrences) {
                newElements.add(n)
            }
        } else {
            elementCountsMap[n] = 1
            newElements.add(n)
        }
    }
    return newElements.toIntArray()
}