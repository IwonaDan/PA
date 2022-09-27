package machine;

import pizza.Recipe;

public class MachineVeggie extends Machine {

    public void clean() {
    }

    public boolean canUseFor(Recipe r) {
        if (!super.canUse())
            return false;

        for (var ingredient : r.getIngredients())
        {
            if (!ingredient.isVegetarianFriendly())
                return false;
        }
        System.out.println("Machine can be used!");
        return true;
    }
}
