package prototype.usages.users

import prototype.usages.IUserPrototype

open class User : IUserPrototype, Cloneable {

    override var isBlocked: Boolean = false

    override fun shallowClone(): IUserPrototype {
        return this.clone() as IUserPrototype
    }
}