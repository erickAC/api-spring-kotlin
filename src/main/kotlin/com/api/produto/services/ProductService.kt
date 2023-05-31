package com.api.produto.services

import com.api.produto.entities.Product
import com.api.produto.models.ObjectNotFoundException
import com.api.produto.repositories.ProductRepository
import org.springframework.stereotype.Service


@Service
class ProductService constructor(private val repository: ProductRepository) : ServiceContract<Product> {

    override fun findAll(): List<Product> {
        return repository.findAll();
    }

    override fun findById(id: Int): Product{
        return repository.findById(id).orElseThrow { throw ObjectNotFoundException("Produto não encontrado: $id") };
    }

    override fun delete(id: Int) {
        return repository.delete(findById(id));
    }

    override fun update(id: Int, t: Product): Product {
        findById(id);
        t.setId(id);
        return repository.save(t);
    }

    override fun save(t: Product): Product {
        return repository.save(t);
    }
}