package com.api.produto.services

interface ServiceContract<T> {
    fun findAll(): List<T>;
    fun findById(id: Int): T;
    fun save(t: T): T;
    fun update(id: Int, t: T): T;
    fun delete(id: Int): Unit;
}