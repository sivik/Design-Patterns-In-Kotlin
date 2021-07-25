package factory.approaches

// Declares the factory method, which returns and object of type Product
abstract class Creator {
    abstract fun factoryMethod(): Product
}