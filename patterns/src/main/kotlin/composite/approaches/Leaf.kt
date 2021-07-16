package composite.approaches

internal class Leaf(name: String) : Component(name) {

    override fun display(depth: Int) = println("""${"-".repeat(depth)}$name""")

    override fun add(c: Component) {
        throw Exception("Cannot add to a leaf");
    }

    override fun remove(c: Component) {
        throw Exception("Cannot remove from a leaf");
    }
}