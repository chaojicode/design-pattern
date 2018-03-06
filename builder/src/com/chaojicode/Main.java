package com.chaojicode;

public class Main {

    public static void main(String[] args) {
	    Engine engine1 = new Engine(new ABBuilder());
        engine1.getEngine();

        Engine engine2 = new Engine(new BCBuilder());
        engine2.getEngine();

        Engine engine3 = new Engine(new ACBuilder());
        engine3.getEngine();
    }
}
