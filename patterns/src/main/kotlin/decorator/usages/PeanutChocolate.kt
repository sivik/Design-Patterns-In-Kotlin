package decorator.usages

class PeanutChocolate(chocolate: Chocolate): ChocolateDecorator(chocolate) {
    override fun getTaste() {
        super.getTaste()
        addTaste()
        println(" It’s Peanut chocolate !");
    }

    private fun addTaste() {
        println(" Adding Peanuts to chocolate !")
    }
}