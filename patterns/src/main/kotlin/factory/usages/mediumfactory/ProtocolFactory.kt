package factory.usages.mediumfactory

object ProtocolFactory {
    fun createProtocol(transmissionType: TransmissionType): Protocol {
        return when (transmissionType) {
            TransmissionType.Ftp -> FtpTransmission().createProtocol()
            TransmissionType.Http -> HttpTransmission().createProtocol()
        }
    }
}