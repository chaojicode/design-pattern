package com.chaojicode;

public class Product {
    private Engine firstPart;
    private Engine lastPart;

    public Engine getFirstPart() {
        return firstPart;
    }

    public void setFirstPart(Engine firstPart) {
        this.firstPart = firstPart;
    }

    public Engine getLastPart() {
        return lastPart;
    }

    public void setLastPart(Engine lastPart) {
        this.lastPart = lastPart;
    }

    public void allRun(){
        firstPart.run();
        lastPart.run();
    };
}
