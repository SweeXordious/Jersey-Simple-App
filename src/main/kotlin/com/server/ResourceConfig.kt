package com.server

import org.glassfish.jersey.server.ResourceConfig

class ResourceConfig :  ResourceConfig(){

    init {
        register(DummyWithAnotherPathImpl::class.java, DummyImpl::class.java)
    }
}