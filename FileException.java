import java.io.*;

class FileCopyProgram {
    public static void main(String args[]) {
        try {
            FileInputStream inputFile = new FileInputStream("filename1.txt");
            FileOutputStream outputFile = new FileOutputStream("filename2.txt");

            int byteData;
            while ((byteData = inputFile.read()) != -1) {
                outputFile.write(byteData);
            }
            inputFile.close();
            outputFile.close();

            System.out.println("File copied successfully.");
        } catch (FileNotFoundException fnfException) {
            System.out.println("Source file not found: " + fnfException.getMessage());
        } catch (IOException ioException) {
            System.out.println("An I/O error occurred: " + ioException.getMessage());
        }
    }
}
