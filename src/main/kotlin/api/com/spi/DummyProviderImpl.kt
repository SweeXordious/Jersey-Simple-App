package api.com.spi

import api.com.dummy1.Dummy
import spi.DummyProviderInterface

class DummyProviderImpl : DummyProviderInterface {
    override fun get(): Class<out Dummy> {
        return Dummy::class.java
    }
}