package com.api

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/anotherPath")
interface DummyWithAnotherPathApi {

    @GET
    @Path("first")
    fun first(): String
}