package builder.approaches

fun main() {
    // Create director and builders
    val director = Director()
    val b1: Builder = ConcreteBuilder1()
    val b2: Builder = ConcreteBuilder2()

    val p1: Product = b1.getResult()
    val p2: Product = b2.getResult()

    // Construct two products
    director.construct(b1)
    director.construct(b2)

    p1.show()
    p2.show()

    // Wait for user
    readLine()
}