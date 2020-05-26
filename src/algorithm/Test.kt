package algorithm

fun main() {
    val n = 200

    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println(sum)

    sum = (1 + n) * n / 2
    println(sum)
}