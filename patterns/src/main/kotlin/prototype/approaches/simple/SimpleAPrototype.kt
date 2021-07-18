package prototype.approaches.simple

class SimpleAPrototype : ISimplePrototype {
    override fun simpleClone(): ISimplePrototype {
        return SimpleAPrototype()
    }
}