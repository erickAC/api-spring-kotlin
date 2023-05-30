package com.api.produto.entities

class Product{
    private var name: String = "";
    private var price: Double = Double.MIN_VALUE;

    fun getName(): String {
        return this.name;
    }

    fun getPrice(): Double {
        return this.price;
    }

    fun setName(name: String){
        this.name = name;
    }

    fun setPrice(price: Double){
        this.price = price;
    }

}