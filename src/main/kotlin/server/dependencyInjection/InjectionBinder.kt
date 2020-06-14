package server.dependencyInjection

import api.com.dummy1.Dummy
import api.com.factories.DummyFactory
import org.glassfish.hk2.utilities.binding.AbstractBinder
import org.glassfish.jersey.process.internal.RequestScoped
import server.spi.DummyFactoryLoader
import server.spi.DummyLoader
import javax.inject.Singleton

class InjectionBinder : AbstractBinder() {
    override fun configure() {
//        bind(DummyFactoryLoader.get().first().componentType).to(DummyLoader.get().first().componentType)
        bindFactory(DummyFactory::class.java).to(Dummy::class.java)
    }

}