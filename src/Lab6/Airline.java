package Lab6;

import java.util.Arrays;

public class Airline {
    private Aircraft[] aircrafts;
    public Airline(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    public double countCapacity(){
        double capacity = 0;
        for (Aircraft a:aircrafts)
            capacity += a.getCapacity();

        return capacity;
    }

    public Aircraft[] getAircrafts() {
        return aircrafts;
    }

    public int countLiftingCapacity(){
        int capacity = 0;
        for (Aircraft a:aircrafts)
            capacity += a.getLiftingCapacity();

        return capacity;
    }

    public Aircraft findPlaneByConsumeRange(double startConsumption, double endConsumption){
        return Arrays.stream(aircrafts).filter(a -> a.fuelConsumption >= startConsumption
                                                && a.fuelConsumption <= endConsumption).findFirst().get();
    }
}
