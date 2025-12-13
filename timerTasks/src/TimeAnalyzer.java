import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class TimeAnalyzer {

    public static void analyze(ArrayList<LocalTime> timestamps) {
        if (timestamps.size() < 2) {
            System.out.println("Insufficient data for analysis.");
            return;
        }

        System.out.println("\n--- High Precision Analysis Results ---");

        // Calculate startup delay using nanoseconds for precision
        long startNanos = Duration.between(timestamps.get(0), timestamps.get(1)).toNanos();
        double startDelayMs = startNanos / 1_000_000.0; // Convert to ms with decimals

        System.out.println(String.format("Startup delay: %.4f ms", startDelayMs));

        long totalErrorNanos = 0;
        int intervalCount = 0;
        long targetNanos = 1_000_000_000L; // 1000 ms = 1 billion nanoseconds

        System.out.println("Interval details:");

        for (int i = 1; i < timestamps.size() - 1; i++) {
            LocalTime current = timestamps.get(i);
            LocalTime next = timestamps.get(i + 1);

            long actualNanos = Duration.between(current, next).toNanos();
            long errorNanos = Math.abs(actualNanos - targetNanos);

            // Convert for display
            double actualMs = actualNanos / 1_000_000.0;
            double errorMs = errorNanos / 1_000_000.0;

            totalErrorNanos += errorNanos;
            intervalCount++;

            System.out.println(String.format("Interval %d -> %d: %.4f ms (Error: %.4f ms)",
                    i, i + 1, actualMs, errorMs));
        }

        if (intervalCount > 0) {
            double avgErrorNanos = (double) totalErrorNanos / intervalCount;
            double avgErrorMs = avgErrorNanos / 1_000_000.0;

            System.out.println(String.format("Average interval error: %.4f ms", avgErrorMs));
        }
    }
}