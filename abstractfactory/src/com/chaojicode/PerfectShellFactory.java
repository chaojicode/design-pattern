package com.chaojicode;

public class PerfectShellFactory extends AbstractFactory {
    @Override
    Engine createEngine() {
        return null;
    }

    @Override
    Shell createShell() {
        return new PerfectShell();
    }
}
