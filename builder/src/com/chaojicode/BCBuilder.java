package com.chaojicode;

public class BCBuilder implements Builder{
    @Override
    public Product build() {
        Product product = new Product();
        product.setFirstPart(new EngineB());
        product.setLastPart(new EngineC());
        return product;
    }
}
