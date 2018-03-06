package com.chaojicode;

public class Main {

    public static void main(String[] args) {
        AbstractFactory engineFacroty = new PerfectEngineFactory();
        Engine engine = engineFacroty.createEngine();
        engine.run();

//        AbstractFactory shellFactory = new TopShellFactory();
        AbstractFactory shellFactory = new PerfectShellFactory();

        Shell shell = shellFactory.createShell();
        shell.color();
    }
}
