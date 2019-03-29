import java.util.function.LongBinaryOperator
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

/*
    Kata
    ====

    Data: An array of integers, a function f of two variables and an init value.
    Example: a = [2, 4, 6, 8, 10, 20], f(x, y) = x + y; init = 0
    Output: an array of integers, say r, such that

    r = [r[0] = f(init, a[0]), r[1] = f(r[0], a[1]), r[2] = f(r[1], a[2]), ...]

    With our example: r = [2, 6, 12, 20, 30, 50]

    Task
    ====

    Write the following functions of two variables
        som : (x, y) -> x + y
        mini : (x, y) -> min(x, y)
        maxi : (x, y) -> max(x, y)
        lcmu : (x, y) -> lcm(abs(x), abs(y) (lcm: least common multiple)
        gcdi : (x, y) -> gcd(abs(x), abs(y) (gcd: greatest common divider)
    and
    function operArray(fct, arr, init) where
    fct is the function of to variables to apply to the array arr (fct will be one of som, mini, maxi, lcmu or gcdi)
    init is the initial value
 */
fun operArray(fct: LongBinaryOperator, arr: LongArray, init: Long): LongArray {
    val output = LongArray(arr.size)
    output[0] = fct.applyAsLong(init, arr[0])
    for (i in 1 until arr.size) {
        output[i] = fct.applyAsLong(output[i - 1], arr[i])
    }
    return output
}

fun som(a: Long, b: Long): Long = a + b

fun maxi(a: Long, b: Long): Long = max(a, b)

fun mini(a: Long, b: Long): Long = min(a, b)

fun gcdi(a: Long, b: Long): Long = gcd(abs(a), abs(b))

fun lcmu(a:Long, b:Long):Long = lcm(abs(a), abs(b))

fun lcm(a: Long, b: Long): Long = (a * b) / gcd(abs(a), abs(b))

fun gcd(xx: Long, yy: Long): Long {
    var n1 = xx
    var n2 = yy
    while (n1 != n2) {
        if (n1 > n2)
            n1 -= n2
        else
            n2 -= n1
    }
    return n1
}