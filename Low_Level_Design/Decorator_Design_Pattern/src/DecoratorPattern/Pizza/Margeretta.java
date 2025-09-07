package DecoratorPattern.Pizza;

import DecoratorPattern.BasePizza.BasePizza;

public class Margeretta extends BasePizza{

    @Override
    public int cost() {
        return 100;
    }

}
