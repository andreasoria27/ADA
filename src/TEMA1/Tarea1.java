package TEMA1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = sc.nextLine();
        File file = new File("files/fichero1.txt");
        if (file.exists()){
            System.out.println("el fichero existe");
        }
        Files.writeString(linea, StandardOpenOption.APPEND);
    }
}
