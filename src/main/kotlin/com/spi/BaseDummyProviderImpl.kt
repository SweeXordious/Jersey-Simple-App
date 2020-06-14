package com.spi

import com.BaseDummyApi
import com.BaseDummyImpl

class BaseDummyProviderImpl : BaseDummyProviderInterface {
    override fun get(): Class<out BaseDummyApi> {
        return BaseDummyImpl::class.java
    }
}