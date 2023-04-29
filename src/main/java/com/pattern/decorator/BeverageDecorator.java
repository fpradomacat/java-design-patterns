package com.pattern.decorator;

public abstract class BeverageDecorator extends Beverage {
    
    private Beverage beverage;
    
    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }

    
}
