package prototype.example

fun makeSupperSheep(sheep: Sheep): Sheep = sheep.also { it -> it.makeSuperSheep() }

fun main() {
    val normalSheep = Sheep().clone()
    val supperSheep = makeSupperSheep(normalSheep)
    println("It's ${supperSheep.type} ${ supperSheep.name}")
}