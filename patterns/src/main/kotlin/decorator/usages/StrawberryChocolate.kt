package decorator.usages

class StrawberryChocolate(c: Chocolate) : ChocolateDecorator(c) {

    override fun getTaste() {
        super.getTaste()
        addTaste()
        println(" It’s Strawberry chocolate !");
    }

    private fun addTaste() {
        println(" Adding Strawberry to chocolate !")
    }
}
