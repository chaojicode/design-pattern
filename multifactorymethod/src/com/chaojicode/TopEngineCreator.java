package com.chaojicode;

public class TopEngineCreator implements Creator {
    @Override
    public Engine factoryMethod() {
        return new TopEngine();
    }
}
