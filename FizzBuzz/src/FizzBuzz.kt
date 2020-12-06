fun fizz(n: Int): Array<String> {
    var elements: Array<String> = emptyArray()
    for (number in 1..n) {
        if (number % 3 == 0) {
            elements += "buzz"
        } else {
            elements += number.toString()
        }
    }
    return elements
}

fun main() {
    val x = fizz(15)
    print(x.contentToString())
}