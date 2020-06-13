package com.server

import com.api.DummyApi

class DummyImpl : DummyApi {
    override fun first(): String {
        return "first from Dummy"
    }

    override fun second(secondValue: String): String {
        return "second with value: $secondValue"
    }
}