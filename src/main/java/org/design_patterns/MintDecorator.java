package org.design_patterns;

public class MintDecorator extends CondimentDecorator implements Beverage{

    public MintDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String prepare() {
        return super.prepare()+" with mint";
    }
}
