package decorator.approaches

class CustomDecorator(private val _component: IComponent) : IDecorator {
    private val component: IComponent = _component

    override fun performMethod() {
        // do your job
        // ...

        //maybe perform origin implementation
        component.performMethod()

        // do your job
        // ...
    }
}