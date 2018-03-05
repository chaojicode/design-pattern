package com.chaojicode;

public class Main {

    public static void main(String[] args) {
//        Creator creator = new LuxuryEngineCreator();
//        Creator creator = new TopEngineCreator();
        Creator creator = new PerfectEngineCreator();
        Engine engine = creator.factoryMethod();
        engine.run();
    }
}
