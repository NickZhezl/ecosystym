package main.java.ecosystemsim.model;

public class Grass extends Plant{

    public Grass() {
        super("Grass");
    }

    @Override
    public void grow() {
        System.out.println("Трава растет, потребляя воду и свет.");
    }

    @Override
    public void interact(Organism other) {
        if (other.getType().equals("Deer")) {
            System.out.println("Трава поедается оленем.");
        }
    }

    @Override
    public String getType() {
        return "Plant";
    }
}
