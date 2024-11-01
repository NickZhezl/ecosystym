package main.java.ecosystemsim.model;

public interface Organism {
    String getName();
    String getType();
    void interact(Organism other);
}
