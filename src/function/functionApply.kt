package function


fun createModel(args: String): Model {
    val model = Model()
    model.arguments = args
    return model
}

/**
 * apply 作用域内 this 代替自身 返回 this
 */
fun createModel2(args: String): Model {
    return Model().apply { arguments = args }
}

fun createModel3(args: String) = Model().apply { arguments = args }

/**
 * 链式调用
 */
fun createModel(args: String, ext: String) = Model().apply { arguments = args }.apply { this.ext = ext }