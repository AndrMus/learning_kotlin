fun fizz(n: Int): Array<String> {
    var elements: Array<String> = emptyArray()
    for (number in 1..n) {
        if (number % 3 == 0 && number % 5 == 0) {
            elements += "fizzbuzz"
        } else if (number % 3 == 0) {
            elements += "fizz"
        } else if (number % 5 == 0) {
            elements += "buzz"
        } else {
            elements += number.toString()
        }
    }
    return elements
}

fun main() {
    val x = fizz(n = 30)
    print(x.contentToString())
}