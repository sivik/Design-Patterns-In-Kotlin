package adapter.usages

class Zipper {
    fun unzip(stream: String): String {
        println("Unzip $stream from original object")
        return "Original unzip content"
    }
}