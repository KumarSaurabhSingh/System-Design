package DecoratorPattern.Pizza;

import DecoratorPattern.BasePizza.BasePizza;

public class VegDelight extends BasePizza{

    @Override
    public int cost() {
        return 270;
    }

}
