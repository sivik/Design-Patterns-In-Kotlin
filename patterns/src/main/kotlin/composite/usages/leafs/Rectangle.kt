package composite.usages.leafs

import composite.usages.Shape

class Rectangle: Shape() {
    override fun add(s: Shape) {
        throw Exception("Cannot add to a leaf");
    }

    override fun remove(s: Shape) {
        throw Exception("Cannot remove from a leaf");
    }
}