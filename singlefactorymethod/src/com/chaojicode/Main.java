package com.chaojicode;

public class Main {

    public static void main(String[] args) {
        Creator creator = new LuxuryEngineCreator();
        Engine luxuryEngine = creator.factoryMethod();
        luxuryEngine.run();
    }
}
