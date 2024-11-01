package main.java.ecosystemsim.utils;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void saveSimulationData(String data, String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + filename);
        }
    }

    public static void log(String message) {
        saveSimulationData(message, "data/log.txt");
    }
}
