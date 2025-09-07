package DecoratorPattern.Pizza;

import DecoratorPattern.BasePizza.BasePizza;

public class Farmhouse extends BasePizza{

    @Override
    public int cost() {
        return 300;
    }
    
}
