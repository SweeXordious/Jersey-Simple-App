package server.spi

import api.com.BaseDummy
import api.com.factories.DummyFactory
import spi.DummyFactoryProviderInterface
import spi.DummyProviderInterface
import java.util.*
import java.util.function.Supplier

object DummyFactoryLoader : Supplier<List<Class<out DummyFactory>>> {

    override fun get(): List<Class<out DummyFactory>> {
        return ServiceLoader.load(DummyFactoryProviderInterface::class.java).map { it.get() }
    }
}