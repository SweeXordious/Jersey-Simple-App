package com.spi

import com.BaseDummyApi
import java.util.*
import java.util.function.Supplier

object BaseDummyLoader : Supplier<List<Class<out BaseDummyApi>>> {

    override fun get(): List<Class<out BaseDummyApi>> {
        return ServiceLoader.load(BaseDummyProviderInterface::class.java).map { it.get() }
    }
}