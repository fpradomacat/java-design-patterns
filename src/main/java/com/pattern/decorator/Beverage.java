package com.pattern.decorator;

public abstract class Beverage {

    String description = "Unknown beverage";

    public abstract Double cost();

    public String getDescription() {
        return description;
    };
}
