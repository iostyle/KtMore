fun main() {
    KSingleton.doSomeThing()
    KLazilySingleton.getInstance().doSomeThing()
    KDCLLazilySingleton.instance.doSomeThing()
    KOptimizeSingleton.getInstance().doSomeThing()
    KEnumSingleton.INSTANCE.doSomeThing()
}