package api.com.dummy1

import api.com.dummy1.DummyApi
import javax.inject.Inject

class DummyImpl : DummyApi {
    override fun first(): String {
        return "first from Dummy"
    }

    override fun second(secondValue: String): String {
        return "second with value: $secondValue"
    }

    override fun injectedDummy(dummy: Dummy): String {
        return dummy.dum1 + dummy.dum2
    }
}