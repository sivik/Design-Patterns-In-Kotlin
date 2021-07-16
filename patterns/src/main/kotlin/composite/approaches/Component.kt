package composite.approaches

abstract class Component protected constructor(private val _name: String) {

    protected val name: String
        get() = _name

    abstract fun add(c: Component)
    abstract fun remove(c: Component)

    open fun display(depth: Int) {}
}