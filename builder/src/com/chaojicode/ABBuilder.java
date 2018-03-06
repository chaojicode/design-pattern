package com.chaojicode;

public class ABBuilder implements Builder {

    @Override
    public Product build() {
        Product product = new Product();
        product.setFirstPart(new EngineA());
        product.setLastPart(new EngineB());
        return product;
    }
}
