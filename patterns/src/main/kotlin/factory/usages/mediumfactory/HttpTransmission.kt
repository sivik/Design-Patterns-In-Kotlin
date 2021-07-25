package factory.usages.mediumfactory

class HttpTransmission : Transmission() {
    override fun createProtocol(): Protocol {
        return HttpProtocol()
    }
}