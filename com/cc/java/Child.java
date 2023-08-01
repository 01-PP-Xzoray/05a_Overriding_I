package com.cc.java;

public class Child extends Parent {
    
    public String sayHello() {
        return "Hallo from Child!";
    }

    public String sayHello(String str) {
        return "Hello, " + str;
    }
}
