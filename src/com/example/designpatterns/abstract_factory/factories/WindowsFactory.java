package com.example.designpatterns.abstract_factory.factories;

import com.example.designpatterns.abstract_factory.buttons.Button;
import com.example.designpatterns.abstract_factory.buttons.WindowsButton;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
