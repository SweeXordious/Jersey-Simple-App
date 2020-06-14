package api.com.spi

import api.com.BaseDummyApi
import api.com.BaseDummyImpl
import spi.BaseDummyProviderInterface

class BaseDummyProviderImpl : BaseDummyProviderInterface {
    override fun get(): Class<out BaseDummyApi> {
        return BaseDummyImpl::class.java
    }
}