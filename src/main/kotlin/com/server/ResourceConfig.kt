package com.server

import com.BaseDummyImpl
import com.spi.BaseDummyLoader
import org.glassfish.jersey.server.ResourceConfig

class ResourceConfig :  ResourceConfig(){

    init {
//        register(BaseDummyImpl::class.java) // To register the class directly
//        packages("com") // To register using package name (dont forget to move the @path from the interface of the `BaseDummyApi` to the implementation
        registerUsingSPI() // Registers classes using a Service Provider Interface
    }

    private fun registerUsingSPI() {
        BaseDummyLoader.get().forEach {
            register(it)
        }
    }
}