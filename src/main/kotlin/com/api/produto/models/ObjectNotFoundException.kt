package com.api.produto.models

import kotlin.reflect.KClass

class ObjectNotFoundException(override val message: String?) : RuntimeException() {

}