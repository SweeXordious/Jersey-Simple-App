package com

import org.glassfish.jersey.server.ExtendedUriInfo
import javax.ws.rs.core.Context
import javax.ws.rs.core.UriInfo

class BaseDummyImpl (@Context val uriInfo: ExtendedUriInfo) : BaseDummyApi {

    override val dummies: Dummies
        get() = DummiesImpl(uriInfo)
}