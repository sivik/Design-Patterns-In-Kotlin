package adapter.approaches

internal class Adapter : Target() {
    private val item = Item()

    override fun request() {
        // Do some other work and then call SpecificRequest
        item.specificRequest()
    }
}