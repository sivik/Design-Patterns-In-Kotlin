package builder.approaches

// This class defines created object
class Product {
    private val parts = ArrayList<String>()

    fun add(part: String) {
        parts.add(part)
    }

    fun show()
    {
        println("Product Parts -------");
        parts.forEach { part ->
            println(part)
        }
    }
}