package com.pattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend";
    }

    @Override
    public Double cost() {
        return Double.valueOf(0.89d);
    }

}
