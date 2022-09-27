package machine;

import fuel.Fuel;
import pizza.Recipe;

import java.util.ArrayList;

public abstract class Machine {

    private Fuel fuel;
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
    public boolean canUse() {
        return fuel != null;
    }

    protected int bake_count;

    public abstract void clean();
    public abstract boolean canUseFor(Recipe r);


    public void onBake() {
        bake_count++;
    }
}
