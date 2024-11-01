package main.java.ecosystemsim.simulation;



import main.java.ecosystemsim.model.Organism;
import main.java.ecosystemsim.model.Grass;
import main.java.ecosystemsim.model.Deer;
import main.java.ecosystemsim.model.Wolf;
import main.java.ecosystemsim.service.Environment;
import main.java.ecosystemsim.utils.FileManager;

import java.util.ArrayList;
import java.util.List;

public class SimulationEngine {
    private Environment environment;
    private List<Organism> organisms;

    public SimulationEngine() {
        this.environment = new Environment(20, 70, 100);
        this.organisms = new ArrayList<>();
        this.organisms.add(new Grass());
        this.organisms.add(new Deer());
        this.organisms.add(new Wolf());
    }

    public void runSimulation() {
        for (int i = 0; i < 10; i++) {  // Пример 10 циклов
            System.out.println("Цикл симуляции " + (i + 1));
            updateEnvironment();
            simulateInteractions();
            logSimulation();
        }
    }

    private void updateEnvironment() {
        environment.adjustClimate();
    }

    private void simulateInteractions() {
        for (Organism org1 : organisms) {
            for (Organism org2 : organisms) {
                if (!org1.equals(org2)) {
                    org1.interact(org2);
                }
            }
        }
    }

    private void logSimulation() {
        FileManager.log("Лог симуляции.");
    }
}


