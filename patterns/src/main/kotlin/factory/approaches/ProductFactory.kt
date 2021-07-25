package factory.approaches

object ProductFactory {
    fun createProduct(productType: ProductType): Product {
        return when (productType) {
            ProductType.Product01 -> ConcreteCreator01().factoryMethod()
            ProductType.Product02 ->  ConcreteCreator02().factoryMethod()
        }
    }
}