package builder.approaches

// This class uses a complex series of steps to initialize object
internal class Director {
    fun construct(builder: Builder) {
        builder.buildPartA()
        builder.buildPartB()
    }
}