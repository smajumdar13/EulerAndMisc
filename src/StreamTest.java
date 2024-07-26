import java.sql.ClientInfoStatus;
import java.util.*;

public class StreamTest {
    public static void main(String[] args) {
//        List<Integer> ls1 = Arrays.asList(1,3);
//        List<Integer> ls2 = Arrays.asList(2,4);
//        List<Integer> ls3 = Arrays.asList(5,7);
//
//        List<List<Integer>> list = Arrays.asList(ls1, ls2, ls3);
//        list.stream().flatMap(Collection::stream).forEach(System.out::print);

        List<String> vehicles = Arrays.asList("Car ", "Bike ", "Truck ", "Car ", "Bus ", "Bike ", "Car ");
        // distinct
        System.out.println("Distinct: ");
        vehicles.stream().distinct().forEach(System.out::print);
        System.out.println();

        // count
        System.out.print("Count distinct: ");
        System.out.println(vehicles.stream().distinct().count());
        System.out.println();

        // limit
        System.out.print("Limit 3: ");
        vehicles.stream().distinct().limit(3).forEach(System.out::print);

        // reduce
        System.out.println();
        System.out.print("Reduce: ");
        System.out.println(vehicles.stream().map(String::length).distinct().reduce(0, Integer::sum));

        System.out.println(vehicles.stream().distinct().reduce((s1, s2) -> s2 + " " + s1));

        // anyMatch
        System.out.println(vehicles.stream().anyMatch(s -> s.equals("Car ")));

        // allMatch
        List<String> vehicles1 = Arrays.asList("Car", "Car", "Car", "Bus");
        System.out.println(vehicles1.stream().allMatch(s -> s.equals("Car")));

        // noneMatch
        System.out.println(vehicles.stream().noneMatch(s -> s.equals("Sam ")));

        System.out.println(vehicles.stream().findAny());
        System.out.println(vehicles.stream().filter(s -> s.equals("Truck ")).findFirst().map(vehicles::indexOf));


    }
}
