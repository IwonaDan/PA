package machine;

import pizza.Recipe;

public class MachineMeat extends Machine {

    public void clean() {
        // this machine doesn't require cleaning
        this.bake_count = 0;
    }

    public boolean canUseFor(Recipe r) {
        if (!super.canUse())
            return false;

        if (this.bake_count < 10) {
            System.out.println("Machine can be used!");
            return true;
        }

        System.out.printf("Machine requires cleaning, %d uses left!\n", 10-this.bake_count);
        return false;
    }

}
