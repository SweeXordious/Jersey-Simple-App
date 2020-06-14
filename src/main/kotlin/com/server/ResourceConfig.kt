package com.server

import com.BaseDummyImpl
import org.glassfish.jersey.server.ResourceConfig

class ResourceConfig :  ResourceConfig(){

    init {
        register(BaseDummyImpl::class.java)
    }
}