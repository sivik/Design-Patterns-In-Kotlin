package builder.usages.directorbuilder

interface IndexedContainer {
    operator fun get(key: String) : String
    operator fun set(key: String, value: String)
}

class Vehicle(private val vehicleType: String): IndexedContainer {
    private val parts = HashMap<String, String>()

    fun show() {
        println("---------------------------")
        println("Vehicle Type: $vehicleType")
        println("Frame: ${parts["frame"]}")
        println("Engine: ${parts["engine"]}")
        println("Wheels: ${parts["wheels"]}")
        println("Doors: ${parts["doors"]}")
    }

    override fun get(key: String): String {
        return parts[key] ?: throw Exception("No value for key $key")
    }

    override fun set(key: String, value: String) {
        parts[key] = value
    }
}