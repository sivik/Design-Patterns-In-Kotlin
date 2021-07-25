package builder.approaches

// This class defines implementation of creating particular object type

class ConcreteBuilder1() : Builder() {
    private val product = Product()

    override fun buildPartA() {
        product.add("PartA")
    }

    override fun buildPartB() {
        product.add("PartB")
    }

    override fun getResult(): Product {
        return product
    }
}