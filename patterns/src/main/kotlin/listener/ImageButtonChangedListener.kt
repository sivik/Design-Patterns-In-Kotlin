package listener

class ImageButtonChangedListener : ButtonClickedListener {

    override fun onLongPressClicked() = println("Long press - Showing menu")

    override fun onShortPressClicked() {
        println("Short press - Showing image")
    }

    override fun onDoubleClicked() = println("Double click - Zoom image")
}