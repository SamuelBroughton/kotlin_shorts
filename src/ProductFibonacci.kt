/*
    Kata
    ====

    The Fibonacci numbers are the numbers in the following
    integer sequence (Fn):

    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

    such as...

    F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.

    Task
    ====

    Given a number, say prod (for product), we search two
    Fibonacci numbers F(n) and F(n+1) verifying

    F(n) * F(n+1) = prod.

    Your function productFib takes an integer (prod) and returns an array:

    [F(n), F(n+1), true]

    If you don't find two consecutive F(m) verifying F(m) * F(m+1) = prod
    you will return

    [F(m), F(m+1), false]
    F(m) being the smallest one such as F(m) * F(m+1) > prod.

    Examples
    ========

    productFib(714) # should return (21, 34, true),
                # since F(8) = 21, F(9) = 34 and 714 = 21 * 34

    productFib(800) # should return (34, 55, false),
                # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
 */

fun productFib(prod: Long): LongArray {
    val result: LongArray = longArrayOf(0, 1, 0) // init with first 2 Fib and false
    var foundOrFailed = false

    while (!foundOrFailed) {
        if (result[0] * result[1] == prod) {
            result[2] = 1
            foundOrFailed = true
        } else if (result[0] * result[1] > prod) {
            foundOrFailed = true
        } else {
            val temp = result[0]
            result[0] = result[1]
            result[1] = result[0] + temp
        }
    }

    return result
}
