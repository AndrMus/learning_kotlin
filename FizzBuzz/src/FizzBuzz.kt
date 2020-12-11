fun fizz(n: Int): Array<String> {
    var elements: Array<String> = emptyArray()
    var v: Boolean = false
    var t: Boolean = false

    for (number in 1..n) {

        if (number % 3 == 0) {
            t = true
        }
        if (number % 5 == 0) {
            v = true
        }

        if (t == true) {
            if (v == true) {
                elements += "fizzbuzz"
            } else {
                elements += "fizz"
            }
        } else if (v == true) {
            elements += "buzz"
        } else {
            elements += number.toString()
        }

        t = false
        v = false
    }

    return elements

}

fun main() {
    val x = fizz(n = 15)
    print(x.contentToString())
}