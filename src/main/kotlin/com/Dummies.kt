package com

import com.anotherDummy.AnotherDummy
import com.dummy1.DummyApi
import javax.ws.rs.GET
import javax.ws.rs.Path

interface Dummies {

    @get:Path("dummy")
    val dummy : DummyApi

    @get:Path("anotherDummy")
    val anotherDummy : AnotherDummy

    @GET
    fun findAll() : String
}