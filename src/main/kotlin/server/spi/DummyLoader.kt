package server.spi

import api.com.BaseDummy
import api.com.BaseDummyApi
import spi.BaseDummyProviderInterface
import spi.DummyProviderInterface
import java.util.*
import java.util.function.Supplier

object DummyLoader : Supplier<List<Class<out BaseDummy>>> {

    override fun get(): List<Class<out BaseDummy>> {
        return ServiceLoader.load(DummyProviderInterface::class.java).map { it.get() }
    }
}