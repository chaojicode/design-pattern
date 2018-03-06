package com.chaojicode;

public class BCBuilder implements Builder{
    @Override
    public Object buildFirst() {
        return new EngineB();
    }

    @Override
    public Object buildLast() {
        return new EngineC();
    }
}
