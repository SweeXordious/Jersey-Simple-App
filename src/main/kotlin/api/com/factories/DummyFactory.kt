package api.com.factories

import api.com.dummy1.Dummy
import org.glassfish.hk2.api.Factory

class DummyFactory : Factory<Dummy> {
    override fun provide(): Dummy {
        return Dummy("Hello from", "HK2")
    }

    override fun dispose(instance: Dummy?) {
        println("BayBaaaay Dummyyyyyyyyy :( :(")
    }
}