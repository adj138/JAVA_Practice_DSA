package scaler.LLD.Structural.Decorator.Pizza.crust;

import scaler.LLD.Structural.Decorator.Pizza.Pizza;

import java.security.InvalidParameterException;

public class NormalCrust implements Pizza {
    Pizza pizza;
    public NormalCrust(){

    }

    public NormalCrust(Pizza pizza) {
        this.pizza = pizza;
        if(this.pizza.getCrustCount() == 2)
            throw new InvalidParameterException("Cannot add more than 2 base");

    }

    @Override
    public double getCost() {
        if(pizza == null)
            return 0.39;
        return this.pizza.getCost() + .39;
    }

    @Override
    public String getDescription() {
        if(pizza == null)
            return "Normal Crust ";
        return this.pizza.getDescription() + "Normal Crust ";
    }

    @Override
    public int getCrustCount() {
        if(pizza == null)
            return 1;
        return this.pizza.getCrustCount() + 1;
    }
}
