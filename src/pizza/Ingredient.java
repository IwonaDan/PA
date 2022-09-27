package pizza;

public abstract class Ingredient {

    public Ingredient(String name, boolean vegetarianFriendly, int amount) {
        this.name = name;
        this.vegetarianFriendly = vegetarianFriendly;
        this.amount = amount;
    }

    private String name;
    private boolean vegetarianFriendly;
    private int amount;

    public String getName() {
        return name;
    }

    public boolean isVegetarianFriendly() {
        return vegetarianFriendly;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public boolean takeAmount(int amount) {
        if (amount > this.amount) {
            return false;
        }
        this.amount -= amount;
        return true;
    }
}
