package com.example.designpatterns.singleton;


public class Singleton {

    private static volatile Singleton instance = null;
    private final String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if(result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    result = instance = new Singleton(data);
                }
            }
        }


        return result;
    }

    public void showData() {
        System.out.println(data);
    }
}
