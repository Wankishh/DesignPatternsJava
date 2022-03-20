package com.example.designpatterns.abstract_factory;

import com.example.designpatterns.abstract_factory.app.Application;
import com.example.designpatterns.abstract_factory.factories.GUIFactory;
import com.example.designpatterns.abstract_factory.factories.MacOsFactory;
import com.example.designpatterns.abstract_factory.factories.WindowsFactory;

public class Main {
    private static Application configureApplication() {
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
