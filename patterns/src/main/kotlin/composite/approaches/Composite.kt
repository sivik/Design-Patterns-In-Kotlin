package composite.approaches

internal class Composite(name: String) : Component(name) {

    private val children = ArrayList<Component>()

    override fun add(c: Component) {
        children.add(c)
    }

    override fun remove(c: Component) {
        children.remove(c)
    }

    override fun display(depth: Int) {
        children.forEach { component ->
            component.display(depth + 1)
        }
    }
}