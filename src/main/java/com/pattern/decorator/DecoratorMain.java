package com.pattern.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("Preparing your 'Double mocha soy latte with whip'...");

        HouseBlend houseBlend = new HouseBlend();
        Soy soy = new Soy(houseBlend);
        Mocha firstMochaShot = new Mocha(soy);
        Mocha secondMochaShot = new Mocha(firstMochaShot);
        Whip whip = new Whip(secondMochaShot);

        System.out.println("The cost is: " + whip.cost());
    }
}
