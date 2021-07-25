package factory.approaches

/// <summary>
/// This class defines interface for created object
/// </summary>
class ConcreteCreator02 : Creator() {
    override fun factoryMethod(): Product {
        return ConcreteProduct02()
    }
}