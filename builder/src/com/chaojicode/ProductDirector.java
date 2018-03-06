package com.chaojicode;

public class ProductDirector {

    private Builder builder;
    public ProductDirector(Builder builder){
        this.builder = builder;
    };

    public Product build(){
        return builder.build();
    }
}
