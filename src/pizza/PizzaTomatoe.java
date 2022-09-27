package pizza;

public class PizzaTomatoe extends Pizza {

    protected PizzaTomatoe() {
        super();
        this.recipe.addIngredient(new Tomatoe(20));
        this.recipe.addIngredient(new Cucumber(5));
        this.fantasyName = "PizzaTomatoe";
    }

    public static Pizza pizzaFactory() {
        return new PizzaTomatoe();
    };
}
