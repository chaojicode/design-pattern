package com.chaojicode;

public class Engine {

    private Object first;
    private Object last;

    public Engine(Builder builder){
        this.first = builder.buildFirst();
        this.last = builder.buildLast();
    }

    public void getEngine(){
        System.out.println(first.toString());
        System.out.println(last.toString());
    }


}
