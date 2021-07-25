package listener

fun main() {
    Button().let { button ->
        ImageButtonChangedListener().let { listener ->
            button.add(listener)
            println("User makes long press on image button")
            button.click = ClickType.LONG
            println("User makes short click on image button")
            button.click = ClickType.SHORT
            println("User makes double click on image button")
            button.delegateClick = ClickType.DOUBLE
            button.remove(listener)
        }
    }
}