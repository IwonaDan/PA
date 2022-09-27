package restaurant;

import fuel.FuelElectricity;
import fuel.FuelWood;
import machine.Machine;
import machine.MachineMeat;
import machine.MachineVeggie;
import pizza.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant {

    protected ArrayList<Ingredient> warehouse;
    protected ArrayList<Pizza> menu;

    protected ArrayList<Machine> machines;
    public Restaurant() {

        this.warehouse = new ArrayList<Ingredient>();
        this.warehouse.add(new Cucumber(1000));
        this.warehouse.add(new Tomatoe(1000));
        this.warehouse.add(new Cheese(1000));

        this.menu = new ArrayList<Pizza>();
        this.menu.add(PizzaMargarita.pizzaFactory());
        this.menu.add(PizzaTomatoe.pizzaFactory());

        var veggie_machine = new MachineVeggie();
        veggie_machine.setFuel(new FuelElectricity());
        var meat_machine = new MachineMeat();
        meat_machine.setFuel(new FuelWood());

        this.machines = new ArrayList<Machine>();
        this.machines.add(veggie_machine);
        this.machines.add(meat_machine);
    }

    public boolean bake(Pizza p) {

        System.out.println("Picking a pizza machine");

        Machine pickedMachine = null;
        for (var machine: this.machines) {
            if (machine.canUseFor(p.getRecipe()))
            {
                pickedMachine = machine;
                break;
            }
        }
        if (pickedMachine == null) {
            System.out.println("Can't find a machine to bake your pizza!");
            return false;
        }

        System.out.println("Baking "+p.getFantasyName());
        pickedMachine.onBake();

        var ok = p.getRecipe().bake(this.warehouse);
        if (ok){
            System.out.println("Successfully baked");
        } else {
            System.out.println("Baking failed");
        }
        return ok;
    }

    public boolean bake(String fantasyName) {
        for (var menuItem: menu) {
            if (menuItem.getFantasyName() == fantasyName) {
                return bake(menuItem);
            }
        }
        System.out.println("Unknown recipe: " + fantasyName);
        return false;
    }

    public void printWarehouse() {
        System.out.println("\nWarehouse status:");
        for (var ingredient : warehouse) {
            System.out.printf("%s: %d\n", ingredient.getName(), ingredient.getAmount());
        }
        System.out.println("---\n");
    }





}
