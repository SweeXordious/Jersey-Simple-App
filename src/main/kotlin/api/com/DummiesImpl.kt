package api.com

import api.com.anotherDummy.AnotherDummyImpl
import api.com.Dummies
import api.com.dummy1.DummyImpl
import api.com.sse.SSeResource
import org.glassfish.jersey.server.ExtendedUriInfo
import org.glassfish.jersey.server.internal.routing.UriRoutingContext
import org.glassfish.jersey.server.model.Resource

class DummiesImpl(val uriInfo: ExtendedUriInfo) : Dummies {

    override val dummy: DummyImpl
        get() = DummyImpl()

    override val anotherDummy: AnotherDummyImpl
        get() = AnotherDummyImpl()

    override val sSeResource: SSeResource
        get() = SSeResource()

    override fun findAll(): String {
        val resourceClass = (uriInfo as UriRoutingContext).resourceClass
        return Resource.builder(resourceClass).build().childResources.joinToString(", ") { it.path }
    }
}