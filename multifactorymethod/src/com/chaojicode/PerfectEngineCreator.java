package com.chaojicode;

public class PerfectEngineCreator implements Creator {
    @Override
    public Engine factoryMethod() {
        return new PerfectEngine();
    }
}
