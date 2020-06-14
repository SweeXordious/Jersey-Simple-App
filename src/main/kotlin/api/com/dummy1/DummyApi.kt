package api.com.dummy1

import javax.inject.Inject
import javax.inject.Named
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam

interface DummyApi{
    @GET
    @Path("first")
    fun first() : String

    @GET
    @Path("second/{secondValue}")
    fun second(@PathParam("secondValue") secondValue: String) : String

    @GET
    @Path("injectedDummy")
    @Inject
    fun injectedDummy(dummy : Dummy) : String
}