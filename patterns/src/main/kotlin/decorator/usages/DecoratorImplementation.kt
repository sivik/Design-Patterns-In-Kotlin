package decorator.usages

fun main(){
    val peanutChocolate = PeanutChocolate(OriginalChocolate())
    peanutChocolate.getTaste()
    val strawberryChocolate = StrawberryChocolate(OriginalChocolate())
    strawberryChocolate.getTaste()
}