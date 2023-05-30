package com.api.produto.resources

import com.api.produto.entities.Product
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Objects

@RestController
@RequestMapping(value = ["produto"])
class ProdutoResource {

    @GetMapping
    fun helloWorld(): ResponseEntity<Product> {
        val product = Product();
        product.setName("Camisa de time");
        product.setPrice(123.4);
        return ResponseEntity.ok().body(product);
    }

}