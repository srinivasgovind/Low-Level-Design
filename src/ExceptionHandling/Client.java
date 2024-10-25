package ExceptionHandling;

import java.io.*;

public class Client {

    public static void main(String[] args) {

        System.out.println("Before Exception occured");

        File file = new File("abc.txt");
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.lines().forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
        finally {
            System.out.println("Executes in all cases");
        }


        System.out.println("After Exception occured");



    }

}
