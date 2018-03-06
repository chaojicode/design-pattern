package com.chaojicode;

public class PerfectEngineFactory extends AbstractFactory {
    @Override
    Engine createEngine() {
        return new PerfectEngine();
    }

    @Override
    Shell createShell() {
        return null;
    }
}
