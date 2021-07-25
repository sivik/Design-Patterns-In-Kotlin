package factory.usages.mediumfactory

class FtpProtocol : Protocol() {
    override fun put(filePath: String) {
        println("Put file in $filePath by Ftp protocol")
    }
}