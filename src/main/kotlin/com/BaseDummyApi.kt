package com

import javax.ws.rs.Path

@Path("/dum")
interface BaseDummyApi {

    @get:Path("dummies")
    val dummies : Dummies
}