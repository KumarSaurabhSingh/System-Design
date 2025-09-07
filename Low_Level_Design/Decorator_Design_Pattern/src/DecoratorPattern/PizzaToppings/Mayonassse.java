package DecoratorPattern.PizzaToppings;

import DecoratorPattern.BasePizza.BasePizza;
import DecoratorPattern.Toppings.Topping_Pizza;

public class Mayonassse extends Topping_Pizza{


    BasePizza basePizza;

    public Mayonassse(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() +30;
    }

}
