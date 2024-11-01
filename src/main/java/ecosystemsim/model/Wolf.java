package main.java.ecosystemsim.model;

public class Wolf extends Animal {

    public Wolf() {
        super("Wolf");
    }

    @Override
    public void eat(Organism food) {
        if (food instanceof Deer) {
            System.out.println("Волк охотится на оленя и поедает его.");
        }
    }

    @Override
    public void interact(Organism other) {
        if (other instanceof Deer) {
            eat(other);
        }
    }

    @Override
    public String getType() {
        return "Carnivore";
    }
}

