package com.chaojicode;

public class TopEngineFactory extends AbstractFactory {
    @Override
    Engine createEngine() {
        return new TopEngine();
    }

    @Override
    Shell createShell() {
        return null;
    }
}
