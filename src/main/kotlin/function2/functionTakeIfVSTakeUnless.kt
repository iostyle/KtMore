package function2

import function.Model

/**
 * takeIf 闭关为true 返回null
 * takeUnless 闭包为false 返回null
 */
fun testTakeIfVSTakeUnless(model: Model) {
    model.takeIf { it.arguments != null && it.arguments!!.isNotEmpty() }
        ?.also { println(it.arguments) } ?: println("isEmpty")

    model.takeUnless { it.arguments == null || it.arguments!!.isEmpty() }
        ?.also { println(it.arguments) } ?: println("isEmpty")
}

fun testTakeIfVSTakeUnless() {
    val model = Model()
    testTakeIfVSTakeUnless(model)
    model.arguments = "abc"
    testTakeIfVSTakeUnless(model)
}