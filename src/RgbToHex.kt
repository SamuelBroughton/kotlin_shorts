/*
    Kata
    ====

    The rgb() method is incomplete. Complete the method
    so that passing in RGB decimal values will result in
    a hexadecimal representation being returned. The valid decimal values for RGB are 0 - 255. Any (r,g,b) argument values that fall out of that range should be rounded to the closest valid value.

    The following are examples of expected output values:

    - rgb(255, 255, 255) // returns FFFFFF
    - rgb(255, 255, 300) // returns FFFFFF
    - rgb(0, 0, 0) // returns 000000
    - rgb(148, 0, 211) // returns 9400D3
 */

const val BASE_16 = 16

fun rgb(r: Int, g: Int, b: Int): String {
    return r.convertToHex() + g.convertToHex() + b.convertToHex()
}

fun Int.convertToHex(): String {
    val colourVal = this.coerceIn(0..255)
    val quotient = colourVal / BASE_16
    val firstHex = quotient.rem(BASE_16).toString(BASE_16)
    val secondHex = colourVal.rem(BASE_16).toString(BASE_16)

    return (firstHex + secondHex).toUpperCase()
}
