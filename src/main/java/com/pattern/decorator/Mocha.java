package com.pattern.decorator;

public class Mocha extends BeverageDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double cost() {
        return super.cost() + 0.2d;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Mocha";
    }

}
