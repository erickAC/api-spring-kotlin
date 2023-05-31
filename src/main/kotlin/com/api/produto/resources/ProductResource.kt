package com.api.produto.resources

import com.api.produto.entities.Product
import com.api.produto.services.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder

@RestController
@RequestMapping(value = ["produto"])
class ProductResource constructor(private val service: ProductService) {

    @GetMapping
    fun findAll(): ResponseEntity<List<Product>> {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("{id}")
    fun findById(@PathVariable id: Int): ResponseEntity<Product> {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    fun save(@RequestBody product: Product): ResponseEntity<Product> {
        val obj = service.save(product);
        val uri = UriComponentsBuilder.fromUriString("http://localhost:8080/${obj.getId()}").build().toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Int, @RequestBody product: Product): ResponseEntity<Product> {
        return ResponseEntity.ok().body(service.update(id, product));
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Int): ResponseEntity<Unit> {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}