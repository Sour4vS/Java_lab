import java.util.*;
import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) {
        try {
            Scanner inputScanner = new Scanner(System.in);

            File file = new File("Register1.txt");
            file.createNewFile();
            System.out.println("The file 'Register1.txt' has been successfully created!\n");

            FileWriter fileWriter = new FileWriter("Register1.txt");

            System.out.print("Please enter your KEAM rank: ");
            int rankNumber = inputScanner.nextInt();
            fileWriter.write(rankNumber + "\n");
            fileWriter.close();

            System.out.println("Rank number has been saved successfully.");
            FileReader fileReader = new FileReader("Register1.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String currentLine;
            System.out.println("\nThe contents of 'Register1.txt' are as follows:");
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }
            bufferedReader.close();
            inputScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
