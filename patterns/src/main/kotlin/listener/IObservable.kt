package listener

interface IObservable {

    val observers: ArrayList<ButtonClickedListener>

    fun add(observer: ButtonClickedListener) = observers.add(observer)

    fun remove(observer: ButtonClickedListener) = observers.remove(observer)

    fun sendShortClickEvent() = observers.forEach { it.onShortPressClicked() }

    fun sendLongClickEvent() = observers.forEach { it.onLongPressClicked() }

    fun sendDoubleClickEvent() = observers.forEach { it.onDoubleClicked() }

}