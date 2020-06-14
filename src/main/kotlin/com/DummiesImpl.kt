package com

import com.anotherDummy.AnotherDummyImpl
import com.Dummies
import com.dummy1.DummyImpl

class DummiesImpl : Dummies {

    override val dummy: DummyImpl
        get() = DummyImpl()

    override val anotherDummy: AnotherDummyImpl
        get() = AnotherDummyImpl()
}