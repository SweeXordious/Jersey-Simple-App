package spi

import api.com.dummy1.Dummy
import java.util.function.Supplier

/*
   * Normally we shouldn't have access to the Dummy1, but to its super class
   * However, for simplicity, we will be referencing the class itself
 */
interface DummyProviderInterface : Supplier<Class<out Dummy>>