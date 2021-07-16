package composite.approaches

fun main(){
    val root = Composite("root")
    root.add(Leaf("Leaf A"))
    root.add(Leaf("Leaf B"))

    val composite1 = Composite("Composite 1")
    composite1.add(Leaf("Leaf 1A"))
    composite1.add(Leaf("Leaf 1B"))

    root.add(composite1)
    root.add(Leaf("Leaf C"))

    // Add and remove a leaf
    val leaf = Leaf("Leaf D")
    root.add(leaf)
    root.remove(leaf)

    // Recursively display tree
    root.display(1);

    // Wait for user
    readLine()
}