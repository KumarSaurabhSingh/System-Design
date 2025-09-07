package DecoratorPattern.PizzaToppings;

import DecoratorPattern.BasePizza.BasePizza;
import DecoratorPattern.Toppings.Topping_Pizza;

public class ExtraCheese extends Topping_Pizza{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 40;
    }

}
