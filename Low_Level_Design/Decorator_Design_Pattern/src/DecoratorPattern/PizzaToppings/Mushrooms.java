package DecoratorPattern.PizzaToppings;

import DecoratorPattern.BasePizza.BasePizza;
import DecoratorPattern.Toppings.Topping_Pizza;

public class Mushrooms extends Topping_Pizza{

    BasePizza basePizza;

    public Mushrooms(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 40;
    }

}
