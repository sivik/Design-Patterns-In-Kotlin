package builder.usages.mediumbuilder

fun main() {

    val asus = Laptop.Builder()
        .setDisk("SSD")
        .setOs("Linux")
        .setRam("16GB")
        .setProcessor("Intel")
        .build()

    fun laptop(init: Laptop.KotlinStyleBuilder.() -> Unit): Laptop =
        Laptop.KotlinStyleBuilder(init).build()

    val lenovo = laptop {
        disk { "HDD" }
        ram { "32GB" }
        os { "Windows" }
        processor { "AMD" }
    }

    println(asus.showConfig())
    println(lenovo.showConfig())
}