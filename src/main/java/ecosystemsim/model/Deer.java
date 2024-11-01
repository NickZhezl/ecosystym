package main.java.ecosystemsim.model;

public class Deer extends Animal {
    public Deer() {
        super("Deer");
    }

    @Override
    public void eat(Organism food) {
        if (food instanceof Grass) {
            System.out.println("Олень ест траву.");
        }
    }

    @Override
    public void interact(Organism other) {
        if (other instanceof Grass) {
            eat(other);
        } else if (other instanceof Wolf) {
            System.out.println("Олень убегает от волка!");
        }
    }

    @Override
    public String getType() {
        return "Herbivore";
    }
}
