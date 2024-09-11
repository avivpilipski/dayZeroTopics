
import java.io.*;

public class MyFileWriter {
    public static void printFileSize(String fileName) {
        File file = new File (fileName);
        System.out.println(file.length());
    }
    public static void main(String[] args) throws IOException {
        String password = "Sorry I Couldn't Find Your Bank Account Info, I Tried Mr. Theiss :()";
        String topSecretData = "I have neither given nor recieved unauthorized aid on this project. My name affirms my honor";

        // 2. Using BufferedWriter
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".notTheissBankAccount.txt"))) {
            bufferedWriter.write(password);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".notClassified/honorCode.hw"))) {
            bufferedWriter.write(topSecretData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printFileSize(".notTheissBankAccount.txt");

    }
    private static void printTotalFileSize(String... fileNames) {
    
        System.out.println("Total size of all files: ...TBD... bytes");
    }
}