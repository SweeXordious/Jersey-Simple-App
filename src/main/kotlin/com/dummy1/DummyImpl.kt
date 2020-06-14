package com.dummy1

import com.dummy1.DummyApi

class DummyImpl : DummyApi {
    override fun first(): String {
        return "first from Dummy"
    }

    override fun second(secondValue: String): String {
        return "second with value: $secondValue"
    }
}