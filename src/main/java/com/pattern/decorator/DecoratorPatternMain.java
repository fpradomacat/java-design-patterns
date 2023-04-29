package com.pattern.decorator;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        System.out.println("Preparing your 'Double mocha soy latte with whip'...");

        Beverage doubleMochaSoyLatteWithWhip = new HouseBlend();
        doubleMochaSoyLatteWithWhip = new Soy(doubleMochaSoyLatteWithWhip);
        doubleMochaSoyLatteWithWhip = new Mocha(doubleMochaSoyLatteWithWhip);
        doubleMochaSoyLatteWithWhip = new Mocha(doubleMochaSoyLatteWithWhip);
        doubleMochaSoyLatteWithWhip = new Whip(doubleMochaSoyLatteWithWhip);

        System.out.println("Done :)");
        System.out.println(doubleMochaSoyLatteWithWhip.getDescription());
        System.out.println(doubleMochaSoyLatteWithWhip.cost());
    }
}
