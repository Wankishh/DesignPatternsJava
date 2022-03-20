package com.example.designpatterns.abstract_factory.app;

import com.example.designpatterns.abstract_factory.buttons.Button;
import com.example.designpatterns.abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;

    public Application(GUIFactory factory) {
        button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
