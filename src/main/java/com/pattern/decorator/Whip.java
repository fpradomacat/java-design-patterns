package com.pattern.decorator;

public class Whip extends BeverageDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double cost() {
        return super.cost() + 0.1d;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Whip";
    }
}
