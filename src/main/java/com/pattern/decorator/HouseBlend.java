package com.pattern.decorator;

public class HouseBlend extends Beverage {

    @Override
    public Double cost() {
        return Double.valueOf(0.89d);
    }

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

}
