import pizza.*;
import restaurant.Restaurant;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {


        var r = new Restaurant();
        r.printWarehouse();
        r.bake("PizzaCaprese");
        r.bake("PizzaRoma");
        for (var i=0; i<11; i++)
            r.bake("PizzaTomatoe");

        for (var i=0; i<11; i++)
            r.bake("PizzaMargarita");

        r.printWarehouse();
    }
}
