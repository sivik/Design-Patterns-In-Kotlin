package composite.usages.components

import composite.usages.Shape

class Canvas : Shape() {
    private val children = ArrayList<Shape>()

    override fun add(s: Shape) {
        children.add(s)
    }

    override fun remove(s: Shape) {
        children.remove(s)
    }

    override fun rotate(degrees: Int) {
        super.rotate(degrees);
        children.forEach { shape ->
            //And rotate children
            shape.rotate(degrees);
        }
    }
}