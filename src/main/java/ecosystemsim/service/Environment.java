package main.java.ecosystemsim.service;

public class Environment {
    private double temperature;
    private double humidity;
    private double water;

    public Environment(double temperature, double humidity, double water) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.water = water;
    }

    public void adjustClimate() {
        temperature += (Math.random() - 0.5) * 2;
        humidity += (Math.random() - 0.5) * 5;
        water -= 2; // Уменьшаем воду в каждом цикле
        System.out.printf("Климат обновлен: Температура=%.2f, Влажность=%.2f, Вода=%.2f%n", temperature, humidity, water);
    }

    // Геттеры
    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWater() {
        return water;
    }

    // Сеттеры
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setWater(double water) {
        this.water = water;
    }
}
