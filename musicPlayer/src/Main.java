import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if not found, try src\\file.mp3 if in source
        String filepath = "toby fox - UNDERTALE Soundtrack - 12 Home.wav";

        try(Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(filepath))) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";
            while (!response.equals("Q")){
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║              CONTROLS                  ║");
                System.out.println("╠══════════╤══════════╤══════════╤═══════╣");
                System.out.println("║ [P] Play │ [S] Stop │ [R] Res  │ [Q]uit║");
                System.out.println("╚══════════╧══════════╧══════════╧═══════╝");
                System.out.print("Your command > ");
                response = sc.nextLine().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported Audio File");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("bye!");

        }
    }
}
