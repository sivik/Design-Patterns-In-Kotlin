package prototype.example

open class Sheep : Cloneable {
    private var legs: Int = 0
    var name: String? = null
    var type: String? = null
        private set

    init {
        type = "Normal sheep"
        name = "Dolly"
        legs = 4
    }

    fun makeSuperSheep() {
        type = "Flying sheep"
        name = "Molly"
        legs = 6
    }

    public override fun clone() = Sheep()

}
