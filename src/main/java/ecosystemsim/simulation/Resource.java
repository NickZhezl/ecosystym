package main.java.ecosystemsim.simulation;

public class Resource {
        private int waterSupply;

        public Resource(int initialWater) {
            this.waterSupply = initialWater;
        }

        public void consumeWater(int amount) {
            if (waterSupply - amount >= 0) {
                waterSupply -= amount;
                System.out.printf("Потребление воды: осталось %d единиц%n", waterSupply);
            } else {
                System.out.println("Недостаточно воды для потребления.");
            }
        }

        public void replenishWater() {
            waterSupply += 50;
            System.out.printf("Запасы воды пополнены, доступно %d единиц воды.%n", waterSupply);
        }

        public int getWaterSupply() {
            return waterSupply;
        }

        public void setWaterSupply(int waterSupply) {
            this.waterSupply = waterSupply;
        }
    }



