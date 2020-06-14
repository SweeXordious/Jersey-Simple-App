package com.anotherDummy

import javax.ws.rs.GET
import javax.ws.rs.Path

interface AnotherDummy {

    @GET
    fun base(): String

    @GET
    @Path("anotherFirst")
    fun first(): String
}