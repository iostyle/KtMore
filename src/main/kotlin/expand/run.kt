package expand

fun main() {
    val user = User("kt")
    user.print()

    val list = arrayListOf("1", "2", "3")
    list.swap(0, 2)
    println(list.toString())

}

fun User.print() {
    println("name:$name")
}

fun ArrayList<String>.swap(index0: Int, index1: Int) {
    val temp = this[index0]
    this[index0] = this[index1]
    this[index1] = temp
}
