package com.kodilla.patterns2.patterns.builder.bigmac;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Bigmac {

    private final int burgers;
    private final String bun;
    private final String sauce;
    private final List<String> ingredients;

    private Bigmac(int burgers, String bun, String sauce, List<String> ingredients) {
        this.burgers = burgers;
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {

        private int burgers;
        private String bun;
        private String sauce;
        private final List<String> ingredients = new LinkedList<>();
        private final Set<String> availableIngredients = new HashSet<>();

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            if(ingredients.size() == 0) {
                availableIngredients.add("salad");
                availableIngredients.add("onions");
                availableIngredients.add("beacon");
                availableIngredients.add("pickle");
                availableIngredients.add("chili");
                availableIngredients.add("mushrooms");
                availableIngredients.add("shrimps");
                availableIngredients.add("cheese");
            }
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if(burgers < 0)
                throw new IllegalArgumentException("Negative amount of burgers provided");
            if(!(bun.equals("sesame") || bun.equals("without sesame")))
                throw new IllegalArgumentException("Wrong bun option");
            if(!(sauce.equals("standard") || sauce.equals("1000 islands") || sauce.equals("barbecue")))
                throw new IllegalArgumentException("Wrong sauce option");
            for(var ingredient : ingredients) {
                if(!availableIngredients.contains(ingredient))
                    throw new IllegalArgumentException("Unavailable ingredient");
            }
            return new Bigmac(burgers, bun, sauce, ingredients);
        }
    }

    public int getBurgers() {
        return burgers;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "{" +
                "burgers=" + burgers +
                ", bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
