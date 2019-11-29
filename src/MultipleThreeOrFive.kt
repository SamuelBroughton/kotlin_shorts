/*
    Kata
    ====

    If we list all the natural numbers below 10 that
    are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.

    Task
    ====

    Finish the solution so that it returns the sum of
    all the multiples of 3 or 5 below the number passed in.
 */

fun getMultipleThreeOrFive(number: Int): Int {
    val setOfFives = number.getMultiplesOfN(5)
    val setOfThrees = number.getMultiplesOfN(3)

    val setOfMultiples = setOfFives
        .plus(setOfThrees)
        .minus(number) // everything below number
    return setOfMultiples.sum()
}

fun Int.getMultiplesOfN(n: Int): Set<Int> {
    val setOfN: MutableSet<Int> = mutableSetOf()
    val highestMultiple = this - (this % n)
    for (i in 1..highestMultiple) {
        if (i % n == 0) {
            setOfN.add(i)
        }
    }
    return setOfN.toSet()
}