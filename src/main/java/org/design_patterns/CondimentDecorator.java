package org.design_patterns;

public class CondimentDecorator implements Beverage{

    private final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String prepare() {
        return beverage.prepare();
    }
}
