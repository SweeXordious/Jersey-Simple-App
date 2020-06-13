package com.server

import com.api.DummyWithAnotherPathApi

class DummyWithAnotherPathImpl : DummyWithAnotherPathApi {
    override fun first(): String {
        return "first from another path"
    }
}