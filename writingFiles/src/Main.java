import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    String textContent = """
            Multiple
                Line
                    String
            Written
                    Here
            
            """;

    try(FileWriter writer = new FileWriter("test.txt")) {
        writer.write(textContent);
        System.out.println("File has been written");
    }
    catch (FileNotFoundException e) {
        System.out.println("Could not locate file location");
    }
    catch (IOException ioException) {
        System.out.println("Could not write to file");
    }


    }
}
