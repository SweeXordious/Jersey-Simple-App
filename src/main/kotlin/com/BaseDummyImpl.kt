package com

class BaseDummyImpl : BaseDummyApi {

    override val dummies: Dummies
        get() = DummiesImpl()
}