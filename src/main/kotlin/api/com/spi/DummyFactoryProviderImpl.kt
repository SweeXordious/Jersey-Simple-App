package api.com.spi

import api.com.factories.DummyFactory
import spi.DummyFactoryProviderInterface

class DummyFactoryProviderImpl : DummyFactoryProviderInterface {
    override fun get(): Class<out DummyFactory> {
        return DummyFactory::class.java
    }
}