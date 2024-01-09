package Lab6;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class AirlineProcessorLab6 {

    public static void process(){
        Aircraft[] ac = {
                new Boeing(13,1235,235,73),
                new Boeing(56,556,54,453),
                new MD11(56,98156,235,45),
                new MD11(68,37856,845,20),
                new MD11(13,852,235,88),
                new Airbus(154,7712,249,65),
                new Airbus(74,35321,354,59),
                new Airbus(96, 2654,432,98)
        };
        Airline al = new Airline(ac);

        System.out.println("Summary lifting capacity: " + al.countLiftingCapacity() + "\n");
        System.out.println("Summary capacity: " + al.countCapacity() + "\n");

        System.out.println("Airline aircrafts:  ");
        Arrays.stream(al.getAircrafts()).forEach(System.out::println);

        Arrays.sort(al.getAircrafts(), new Comparator<Aircraft>() {
            @Override
            public int compare(Aircraft o1, Aircraft o2) {
                return Double.compare(o1.getFlightRange(), o2.getFlightRange());
            }
        });

        System.out.println("\nAirline aircrafts sorted by flight range: ");
        Arrays.stream(al.getAircrafts()).forEach(System.out::println);

        System.out.println("\nAircraft that satisfies 50-114 fuel consumption range");
        System.out.println(al.findPlaneByConsumeRange(50, 114));
    }

}
