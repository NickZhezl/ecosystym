/**
 @author: Nikita Zhelezko */
package main.java.ecosystemsim.controller;
import main.java.ecosystemsim.simulation.SimulationEngine;
import main.java.ecosystemsim.utils.FileManager;
public class EcosystemSimulator {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в симулятор экосистемы!");

        SimulationEngine engine = new SimulationEngine();
        engine.runSimulation();
    }
}
