import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        LocalTime todayTime = LocalTime.now();
//        System.out.println(todayTime);
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);

        LocalDateTime dateTime = LocalDateTime.now();

        Instant instant = Instant.now(); // UTC time
        System.out.println(instant);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2026, 12, 12, 20, 30, 50);
        LocalDateTime date2 = LocalDateTime.of(2019, 12, 12, 20, 30, 50);

        System.out.println(date1);
        System.out.println(date2);

        if (date1.isBefore(date2)){
            System.out.println(date1 + " is before " + date2);
        }
        else if (date2.isBefore(date1)) {
            System.out.println(date2 + " is before " + date1);
        }

        if (date2.isAfter(date1)) {
            System.out.println(date2 + " is after " + date1);
        }
        else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        }

        LocalDate localDateSame1 = LocalDate.of(2020, 12, 12);
        LocalDate localDateSame2 = LocalDate.of(2020, 12, 12);

        if (localDateSame1.isEqual(localDateSame2)){
            System.out.println(localDateSame1 + " is equal to " + localDateSame2);
        }

        /// for modern machines, this loop can show update rate of
        /// local clock of system you're running on.
        /// Windows 11 dynamically changes timer clock depending on program
        /// that's why in many optimisations, especially for gaming,
        /// it's recommended to use custom timer resolution (ISLC), and it's
        /// always set to minimum (0.5 ms) to improve system responsiveness. (NtSetTimerResolution)

//        ArrayList<LocalTime> timestamps = new ArrayList<>();
//
//        int iterations = 1000000;
//
//        for (int i = 0; i < iterations; i++){
//            timestamps.add(LocalTime.now());
//        }
//
//        timestamps.forEach(System.out::println);
    }
}
