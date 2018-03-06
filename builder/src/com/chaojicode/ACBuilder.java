package com.chaojicode;

public class ACBuilder implements Builder{
    @Override
    public Product build() {
        Product product = new Product();
        product.setFirstPart(new EngineA());
        product.setLastPart(new EngineC());
        return product;
    }
}
