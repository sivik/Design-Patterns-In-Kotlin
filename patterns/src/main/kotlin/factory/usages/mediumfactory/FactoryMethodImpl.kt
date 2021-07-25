package factory.usages.mediumfactory

enum class TransmissionType {
    Ftp, Http
}

fun main() {

    fun sendFtp() = ProtocolFactory.createProtocol(TransmissionType.Ftp).put("c:\\file.txt")
    fun sendHttp() = ProtocolFactory.createProtocol(TransmissionType.Http).put("c:\\file.txt")

    sendFtp()
    sendHttp()
}
