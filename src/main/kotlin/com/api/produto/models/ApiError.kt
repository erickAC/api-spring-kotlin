package com.api.produto.models

class ApiError(val status: Int, val path: String){

    var message: String = ""
        get() {
            return field;
        }
        set(value) {
            field = value
        }

}