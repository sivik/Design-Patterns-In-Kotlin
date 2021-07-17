package composite.usages

abstract class Shape {
    abstract fun add(s: Shape)
    abstract fun remove(s: Shape)

    open fun rotate(degrees: Int) {
        //Some rotation logic here
    }
}