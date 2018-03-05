package com.chaojicode;

public class Form {
    Manager agrre(String name){
        if ("A".equals(name)){
            return new ManagerA();
        }else if ("B".equals(name)){
            return new ManagerB();
        }else {
            return new ManagerC();
        }
    }
}
