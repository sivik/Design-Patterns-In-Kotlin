package builder.usages.simplebuilder

// https://chercher.tech/kotlin/builder-design-pattern-kotlin
fun main(args: Array<String>) {

    val compBuilder = ComputerBuilder().apply {
        setOS("Windows XP")
        setRAM(128)
        setBattery("Inbuilt")
        setExternalMouse(true)
        setScreenSize(19.5)
    }

    println(Computer(compBuilder).build())
}