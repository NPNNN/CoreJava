package FindMyTrain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem system = new TrainSystem();

        // Adding new stations
        Station station1 = new Station("S00333", "Agra");
        Station station2 = new Station("S00444", "Lucknow");

        // Adding new trains
        Train train1 = new Train("12408", "Duranto Exp", "Express");
        Train train2 = new Train("12608", "Intercity", "Passenger");

        // Assigning platforms
        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);
        p1.setTrain(train1);
        p2.setTrain(train2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);

        station1.setPlatformList(platformList);

        // Adding schedules with LocalDateTime for arrival and departure
        Schedule s1 = new Schedule(train1, station1, LocalDateTime.of(2024, 11, 11, 9, 0), LocalDateTime.of(2024, 11, 11, 9, 5), p1);
        Schedule s2 = new Schedule(train2, station2, LocalDateTime.of(2024, 11, 11, 10, 0), LocalDateTime.of(2024, 11, 11, 10, 2), p2);

        system.addStations(station1);
        system.addStations(station2);
        system.addTrain(train1);
        system.addTrain(train2);
        system.addSchedule(s1);
        system.addSchedule(s2);

        // Find train between stations
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source: ");
        String source = sc.nextLine().trim().toLowerCase();  // Normalize input
        System.out.print("Enter the destination: ");
        String destination = sc.nextLine().trim().toLowerCase();  // Normalize input

        List<Schedule> myTrains = system.findMyTrains(source, destination);

        if (myTrains.isEmpty()) {
            System.out.println("No trains found between " + source + " and " + destination + ".");
        } else {
            System.out.println("Trains between " + source + " and " + destination + ":");
            for (Schedule schedule : myTrains) {
                System.out.println(schedule);
            }
        }

        sc.close();  
    }
}
