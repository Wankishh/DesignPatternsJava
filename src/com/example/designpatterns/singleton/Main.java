package com.example.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance("data");
        Singleton instance2 = Singleton.getInstance("data2");

        System.out.println("Hash of 1: " + System.identityHashCode(instance1));
        System.out.println("Hash of 2: " + System.identityHashCode(instance2));
        System.out.println(instance1 == instance2);
    }
}
