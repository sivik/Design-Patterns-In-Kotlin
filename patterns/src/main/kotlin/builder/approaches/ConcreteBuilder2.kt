package builder.approaches

// This class defines implementation of creating particular object type

class ConcreteBuilder2 : Builder() {
    private val product = Product()

    override fun buildPartA() {
        product.add("PartX");
    }

    override fun buildPartB() {
        product.add("PartY");
    }

    override fun getResult(): Product {
        return product;
    }
}