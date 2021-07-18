package adapter.approaches

internal open class Target {
    open fun request() {
        println("Called Target Request()")
    }
}