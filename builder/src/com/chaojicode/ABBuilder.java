package com.chaojicode;

public class ABBuilder implements Builder {
    @Override
    public Object buildFirst() {
        return new EngineA();
    }

    @Override
    public Object buildLast() {
        return new EngineB();
    }
}
