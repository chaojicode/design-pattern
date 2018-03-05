package com.chaojicode;

public class LuxuryEngineCreator implements Creator {
    @Override
    public Engine factoryMethod() {
        return new LuxuryEngine();
    }
}
