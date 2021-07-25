package listener

import kotlin.properties.Delegates

enum class ClickType {
    LONG, SHORT, DOUBLE
}

class Button : IObservable {

    override val observers = arrayListOf<ButtonClickedListener>()

    //simple way
    var click: ClickType? = null
        set(value) {
            field = value
            when(click){
                ClickType.LONG ->  sendLongClickEvent()
                ClickType.SHORT ->  sendShortClickEvent()
                ClickType.DOUBLE -> sendDoubleClickEvent()
                null -> throw Exception("Click type is required")
            }
        }

    // or nice kotlin delegates
    var delegateClick: ClickType by Delegates.observable(ClickType.SHORT) { _, _, _ ->
        when(click){
            ClickType.LONG ->  sendLongClickEvent()
            ClickType.SHORT ->  sendShortClickEvent()
            ClickType.DOUBLE -> sendDoubleClickEvent()
            null -> throw Exception("Click type is required")
        }
    }

}

