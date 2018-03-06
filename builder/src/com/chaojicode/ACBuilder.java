package com.chaojicode;

public class ACBuilder implements Builder{
    @Override
    public Object buildFirst() {
        return new EngineA();
    }

    @Override
    public Object buildLast() {
        return new EngineC();
    }
}
