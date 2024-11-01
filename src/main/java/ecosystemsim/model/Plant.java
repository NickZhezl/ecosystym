package main.java.ecosystemsim.model;

public abstract class Plant implements Organism {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Plant";
    }

    public abstract void grow();
}
