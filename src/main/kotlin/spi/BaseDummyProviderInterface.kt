package spi

import api.com.BaseDummy
import api.com.BaseDummyApi
import java.util.function.Supplier

/*
  * This interface can be in a different project where we have no access to the implementation
  * of the BaseDummyApi.
  * Thus, leaving the implementation to the user to implement it as he wishes
 */
interface BaseDummyProviderInterface : Supplier<Class<out BaseDummyApi>>