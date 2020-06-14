package com

import com.anotherDummy.AnotherDummyImpl
import com.Dummies
import com.dummy1.DummyImpl
import org.glassfish.jersey.server.ExtendedUriInfo
import org.glassfish.jersey.server.internal.routing.UriRoutingContext
import org.glassfish.jersey.server.model.Resource

class DummiesImpl(val uriInfo: ExtendedUriInfo) : Dummies {

    override val dummy: DummyImpl
        get() = DummyImpl()

    override val anotherDummy: AnotherDummyImpl
        get() = AnotherDummyImpl()

    override fun findAll(): String {
        val resourceClass = (uriInfo as UriRoutingContext).resourceClass
        return Resource.builder(resourceClass).build().childResources.joinToString(", ") { it.path }
    }
}