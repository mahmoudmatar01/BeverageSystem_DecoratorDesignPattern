package org.design_patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Beverage tea = new Tea();
        System.out.println(tea.prepare());

        Beverage coffee = new Coffee();
        System.out.println(coffee.prepare());

        Beverage coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println(coffeeWithMilk.prepare());

        Beverage teaWithMint = new MintDecorator(tea);
        System.out.println(teaWithMint.prepare());

        Beverage sugarCoffee = new SugarDecorator(coffee);
        System.out.println(sugarCoffee.prepare());

        Beverage sugarCoffeeWithMilk = new SugarDecorator(new MintDecorator(coffee));
        System.out.println(sugarCoffeeWithMilk.prepare());

    }
}