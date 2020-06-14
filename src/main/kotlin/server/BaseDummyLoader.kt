package server

import api.com.BaseDummyApi
import spi.BaseDummyProviderInterface
import java.util.*
import java.util.function.Supplier

object BaseDummyLoader : Supplier<List<Class<out BaseDummyApi>>> {

    override fun get(): List<Class<out BaseDummyApi>> {
        return ServiceLoader.load(BaseDummyProviderInterface::class.java).map { it.get() }
    }
}