package composite.usages.leafs

import composite.usages.Shape

class Triangle : Shape() {
    override fun add(s: Shape) {
        throw Exception("Cannot add to a leaf");
    }

    override fun remove(s: Shape) {
        throw Exception("Cannot remove from a leaf");
    }

    override fun rotate(degrees: Int) {
        //Some triangle rotation logic here if different than in base class
    }
}