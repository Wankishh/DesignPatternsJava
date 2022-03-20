package com.example.designpatterns.abstract_factory.factories;

import com.example.designpatterns.abstract_factory.buttons.Button;

public interface GUIFactory {
    Button createButton();
}
