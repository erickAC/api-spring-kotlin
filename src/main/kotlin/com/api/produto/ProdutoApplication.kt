package com.api.produto

import com.api.produto.entities.Product
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProdutoApplication

fun main(args: Array<String>) {
	runApplication<ProdutoApplication>(*args);
}
