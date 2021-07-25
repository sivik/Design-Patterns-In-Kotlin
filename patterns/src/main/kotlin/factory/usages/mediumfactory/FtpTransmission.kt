package factory.usages.mediumfactory

class FtpTransmission : Transmission() {
    override fun createProtocol(): Protocol {
        return FtpProtocol()
    }
}