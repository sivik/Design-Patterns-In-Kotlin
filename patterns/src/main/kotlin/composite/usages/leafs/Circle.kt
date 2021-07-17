package composite.usages.leafs

import composite.usages.Shape

internal class Circle : Shape() {

    override fun rotate(degrees: Int) {
        //Nothing here, circle does not need rotation
    }

    override fun add(s: Shape) {
        throw Exception("Cannot add to a leaf");
    }

    override fun remove(s: Shape) {
        throw Exception("Cannot remove from a leaf");
    }
}