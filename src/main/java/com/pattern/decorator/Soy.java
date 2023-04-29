package com.pattern.decorator;

public class Soy extends BeverageDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double cost() {
        return super.cost() + 0.15d;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Soy";
    }

}
