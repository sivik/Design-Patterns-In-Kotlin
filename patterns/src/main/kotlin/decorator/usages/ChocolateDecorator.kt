package decorator.usages

open class ChocolateDecorator(private var chocolate: Chocolate) : Chocolate {

    override fun getTaste() {
        this.chocolate.getTaste()
    }
}