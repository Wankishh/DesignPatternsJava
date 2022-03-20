package com.example.designpatterns.abstract_factory.factories;

import com.example.designpatterns.abstract_factory.buttons.Button;
import com.example.designpatterns.abstract_factory.buttons.MacOsButton;

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }
}
