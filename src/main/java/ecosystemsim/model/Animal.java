package main.java.ecosystemsim.model;

public abstract class Animal implements Organism {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Animal";
    }

    public abstract void eat(Organism food);
}
