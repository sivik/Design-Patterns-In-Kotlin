package adapter.usages

class ZipperAdapter : ICompression
{
    private val zipper = Zipper()
    override fun decompress(stream: String) {
        val originalContent = zipper.unzip(stream)
        println("Make additional adapter action for $originalContent")
    }
}