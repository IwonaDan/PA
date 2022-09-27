package pizza;

public class Pizza {

    public Pizza() {
        this.recipe = new Recipe();
    }

    protected String fantasyName;
    protected Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public boolean isVegetarian() {
        for (var ingredient: recipe.getIngredients()) {
            if (!ingredient.isVegetarianFriendly())
                return false;
        }
        return true;
    }
}
