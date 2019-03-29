/*
    Kata
    ====

    Given two arrays of strings a1 and a2 return a sorted array
    r in lexicographical order of the strings of a1 which are
    substrings of strings of a2.

    Example
    =======

    a1 = ["arp", "live", "strong"]
    a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
    returns ["arp", "live", "strong"]

    NB: r must be without duplicates
 */
fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
    return array1.toSortedSet().filter { it in array2.joinToString() }.toTypedArray()
}