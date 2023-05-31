package com.api.produto.entities

import jakarta.persistence.*

@Entity
@Table(name = "product")
class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Int? = null;

    private var name: String = "";
    private var price: Double = 0.0;

    fun getId(): Int?{
        return this.id;
    }

    fun getName(): String{
        return this.name;
    }

    fun getPrice(): Double{
        return this.price;
    }

    fun setId(id: Int){
        this.id = id;
    }

    fun setName(name: String){
        this.name = name;
    }

    fun setPrice(price: Double){
        this.price = price;
    }

}