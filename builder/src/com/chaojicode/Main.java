package com.chaojicode;

public class Main {

    public static void main(String[] args) {
	    ProductDirector d1 = new ProductDirector(new ABBuilder());
	    Product p1 = d1.build();
	    p1.allRun();

        ProductDirector d2 = new ProductDirector(new ACBuilder());
        Product p2 = d2.build();
        p2.allRun();

        ProductDirector d3 = new ProductDirector(new BCBuilder());
        Product p3 = d3.build();
        p3.allRun();
    }
}
