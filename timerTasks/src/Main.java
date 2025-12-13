import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        ArrayList<LocalTime> timestamps = new ArrayList<>();

        timestamps.add(LocalTime.now());

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int repeats = 5;

            @Override
            public void run() {
                System.out.println("Hello");
                timestamps.add(LocalTime.now());
                repeats--;

                if (repeats == 0) {
                    System.out.println("Task complete");
                    timer.cancel();
                    TimeAnalyzer.analyze(timestamps);
                }
            }
        };

        timer.schedule(task, 0, 1000);
    }
}