import java.time.LocalTime;
import java.util.*;
import java.util.stream.*;

interface TransportService {
    String getName();
    List<Schedule> getSchedules();

    default void printServiceDetails() {
        System.out.println("Service: " + getName() + " (" + getSchedules().size() + " schedules)");
    }

    default Stream<Schedule> liveSchedules() {
        return getSchedules().stream().filter(Schedule::isActive);
    }
}

interface GeoUtils {
    static double calculateDistance(Location a, Location b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}

@FunctionalInterface
interface FareCalculator {
    double calculateFare(Schedule schedule, double distance);
}


interface EmergencyService {}


class Schedule {
    private String route;
    private LocalTime dep;
    private double fare;
    private boolean active;

    Schedule(String route, LocalTime dep, double fare, boolean active) {
        this.route = route; this.dep = dep; this.fare = fare; this.active = active;
    }
    public String getRoute() { return route; }
    public LocalTime getDep() { return dep; }
    public double getFare() { return fare; }
    public boolean isActive() { return active; }
    @Override public String toString() {
        return route + " dep=" + dep + " fare=" + fare;
    }
}

class Location { double x,y; Location(double x,double y){this.x=x;this.y=y;} }

class BusService implements TransportService {
    private String name; private List<Schedule> schedules = new ArrayList<>();
    BusService(String name){ this.name=name; }
    public String getName(){ return name; }
    public List<Schedule> getSchedules(){ return schedules; }
}

class AmbulanceService implements TransportService, EmergencyService {
    private String name; private List<Schedule> schedules = new ArrayList<>();
    AmbulanceService(String name){ this.name=name; }
    public String getName(){ return name; }
    public List<Schedule> getSchedules(){ return schedules; }
}


public class SmartCity {
    public static void main(String[] args) {

        TransportService bus = new BusService("City Bus");
        bus.getSchedules().add(new Schedule("B1", LocalTime.of(9,0), 40, true));
        bus.getSchedules().add(new Schedule("B2", LocalTime.of(10,0), 30, false));

        TransportService ambulance = new AmbulanceService("City Ambulance");
        ambulance.getSchedules().add(new Schedule("A1", LocalTime.of(9,15), 0, true));

        List<TransportService> services = Arrays.asList(bus, ambulance);

        System.out.println("\n--- Available Services (Fare <= 50, sorted by dep time) ---");
        services.stream()
            .flatMap(s -> s.liveSchedules())
            .filter(s -> s.getFare() <= 50)
            .sorted(Comparator.comparing(Schedule::getDep))
            .forEach(System.out::println);

        System.out.println("\n--- Service Details ---");
        services.forEach(TransportService::printServiceDetails);

        Map<Boolean, List<Schedule>> grouped =
            services.stream().flatMap(s -> s.getSchedules().stream())
                    .collect(Collectors.partitioningBy(Schedule::isActive));
        System.out.println("\nActive schedules: " + grouped.get(true).size());
        System.out.println("Inactive schedules: " + grouped.get(false).size());

        FareCalculator calc = (sch, dist) -> sch.getFare() + dist * 2;
        double dist = GeoUtils.calculateDistance(new Location(1,1), new Location(4,5));
        System.out.println("\nFare for Bus B1 (distance=" + dist + "): " +
            calc.calculateFare(bus.getSchedules().get(0), dist));

        System.out.println("\n--- Emergency Services ---");
        services.stream()
            .filter(s -> s instanceof EmergencyService)
            .forEach(s -> System.out.println(s.getName() + " has emergency priority!"));
    }
}
