package pizza;

import java.util.ArrayList;

public class Recipe {
    private String fantasyName;
    private ArrayList<Ingredient> ingredients;

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public Recipe() {
        this.ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(Ingredient i) {
        ingredients.add(i);
    }

    public boolean bake(ArrayList<Ingredient> ingredientsAvailable)  {

        int ingredientsUsed = 0;
        for (var ingredientRequired : ingredients) {
            for (var i = 0; i < ingredientsAvailable.size(); i++) {


                if (!ingredientRequired.getClass().equals(ingredientsAvailable.get(i).getClass()))
                    continue;

                if (ingredientsAvailable.get(i).getAmount() <= ingredientRequired.getAmount())
                    return false;
                ingredientsUsed ++;
                break;
            }
        }

        if (ingredientsUsed < ingredients.size())
            return false;

        for (var ingredientRequired : ingredients) {
            for (var i = 0; i < ingredientsAvailable.size(); i++) {
                if (!ingredientRequired.getClass().equals(ingredientsAvailable.get(i).getClass()))
                    continue;
                ingredientsAvailable.get(i).takeAmount(ingredientRequired.getAmount());
            }
        }

        return true;
    }

}
