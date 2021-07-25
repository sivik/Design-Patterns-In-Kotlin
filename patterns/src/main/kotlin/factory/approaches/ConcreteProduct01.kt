package factory.approaches

// This class implements the Product interface
class ConcreteProduct01 : Product() {
    override fun doSth() {
        println("I make something one")
    }
}