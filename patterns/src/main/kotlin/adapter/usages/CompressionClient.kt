package adapter.usages

fun main(){
    // Create adapter and place a request
    val compressionSupport: ICompression = ZipperAdapter()
    compressionSupport.decompress("stream")
    readLine()
}