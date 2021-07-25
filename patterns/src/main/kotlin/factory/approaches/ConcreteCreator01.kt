package factory.approaches

/// <summary>
/// Overrides the factory method to return an instance of ConcreteProduct
/// </summary>
class ConcreteCreator01 : Creator() {
    override fun factoryMethod(): Product {
        return ConcreteProduct01()
    }
}