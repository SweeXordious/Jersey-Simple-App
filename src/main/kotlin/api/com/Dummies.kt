package api.com

import api.com.anotherDummy.AnotherDummy
import api.com.dummy1.DummyApi
import api.com.sse.SSeResource
import javax.ws.rs.GET
import javax.ws.rs.Path

interface Dummies {

    @get:Path("dummy")
    val dummy : DummyApi

    @get:Path("anotherDummy")
    val anotherDummy : AnotherDummy

    @get:Path("sse")
    val sSeResource : SSeResource

    @GET
    fun findAll() : String
}