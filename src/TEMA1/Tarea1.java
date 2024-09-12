package TEMA1;

import java.io.File;

public class Tarea1 {
    public static void main(String[] args) {
        File file = new File("files/fichero1.txt");
        if (file.exists()){
            System.out.println("el fichero existe");
        }
        System.out.println(file.getAbsoluteFile());
    }
}
