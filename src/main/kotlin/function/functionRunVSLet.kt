package function

fun testRunVSLet(str: String?) {

    /**
     * let 作用域中 it 代替本体 并且可以重命名
     */
    str?.let {
        println("length: ${it.length}")
    }

    str?.let { newName ->
        println("length: ${newName.length}")
    }

    /**
     * run 作用域中 this 代替本体 通常this可以省略
     */
    str?.run {
        //        println("length: $this.length")
        println("length: $length")
    }

    /**
     * run 无法用于将自身作为参数传递
     */
    str?.run {
        //        testRunVsLet(this)
    }

//    str?.let{
//        testRunVsLet(it)
//    }
}
