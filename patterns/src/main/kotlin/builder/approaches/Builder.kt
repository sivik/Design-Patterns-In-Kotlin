package builder.approaches

// This class defines abstract interface for creating part of object
abstract class Builder
{
    abstract fun buildPartA()
    abstract fun buildPartB()
    abstract fun getResult(): Product
}