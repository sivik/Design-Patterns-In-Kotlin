package prototype.usages

interface IUserPrototype {

    var isBlocked: Boolean
    fun shallowClone(): IUserPrototype
}