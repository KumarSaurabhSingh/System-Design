package DecoratorPattern.Main;

import DecoratorPattern.BasePizza.BasePizza;
import DecoratorPattern.Pizza.Farmhouse;
import DecoratorPattern.PizzaToppings.ExtraCheese;
import DecoratorPattern.PizzaToppings.Mushrooms;

public class Main {

    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new Mushrooms(new Farmhouse()));

        System.out.println("You Bill is : " + basePizza.cost());
    }

}
