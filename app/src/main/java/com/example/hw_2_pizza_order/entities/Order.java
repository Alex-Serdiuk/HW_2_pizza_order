package com.example.hw_2_pizza_order.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
    private int pizzaCount;
    private PizzaRecipe pizzaRecipe;
    private PizzaSize pizzaSize;
    private List<ToppingCount> toppingCountList = new ArrayList<>();

    public Order() {
    }

    public int getPizzaCount() {
        return pizzaCount;
    }

    public void setPizzaCount(int pizzaCount) {
        this.pizzaCount = pizzaCount;
    }

    public PizzaRecipe getPizzaRecipe() {
        return pizzaRecipe;
    }

    public void setPizzaRecipe(PizzaRecipe pizzaRecipe) {
        this.pizzaRecipe = pizzaRecipe;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public List<ToppingCount> getToppingCountList() {
        return toppingCountList;
    }

    public void setToppingCountList(List<ToppingCount> toppingCountList) {
        this.toppingCountList = toppingCountList;
    }

    public void addToppingCount(ToppingCount toppingCount){
        toppingCountList.add(toppingCount);
    }
}
