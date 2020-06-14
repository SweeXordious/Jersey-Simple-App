package spi

import api.com.factories.DummyFactory
import java.util.function.Supplier

/*
   * Normally we shouldn't have access to the DummyFactory, but to its super class
   * However, for simplicity, we will be referencing the class itself
 */
interface DummyFactoryProviderInterface : Supplier<Class<out DummyFactory>> {
}