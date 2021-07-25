package factory.usages.mediumfactory

class HttpProtocol : Protocol() {
    override fun put(filePath: String) {
        println("Put file in $filePath by http protocol")
    }
}