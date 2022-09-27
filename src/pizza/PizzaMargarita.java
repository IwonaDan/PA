package pizza;

public class PizzaMargarita extends Pizza {

    protected PizzaMargarita() {
        super();
        this.recipe.addIngredient(new Cheese(10));
        this.recipe.addIngredient(new Tomatoe(1));
        this.fantasyName = "PizzaMargarita";
    }

    public static Pizza pizzaFactory() {
        return new PizzaMargarita();
    };
}
