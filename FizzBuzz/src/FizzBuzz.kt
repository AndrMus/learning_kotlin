fun fizz(n: Int): Array<String> {
    var elements: Array<String> = emptyArray()

    for (number in 1..n) {

        val t = (number % 3 == 0)
        val v = (number % 5 == 0)

        if (t) {
            if (v) {
                elements += "fizzbuzz"
            } else {
                elements += "fizz"
            }
        } else if (v) {
            elements += "buzz"
        } else {
            elements += number.toString()
        }
    }
    return elements
}

fun main() {
    val x = fizz(n = 16)
    print(x.contentToString())
}