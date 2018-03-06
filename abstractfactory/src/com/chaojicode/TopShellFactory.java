package com.chaojicode;

public class TopShellFactory extends AbstractFactory {
    @Override
    Engine createEngine() {
        return null;
    }

    @Override
    Shell createShell() {
        return new TopShell();
    }
}
