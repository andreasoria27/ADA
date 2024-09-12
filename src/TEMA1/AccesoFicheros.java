package TEMA1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class AccesoFicheros {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(args[0])) {
            fw.write("Texto de prueba");
        } catch (IOException e) {
            System.err.println("Error");
        }


//Files, FIle, Path,Paths
File file = new File("files/fichero1.txt");
if (file.exists()){
    System.out.println("el fichero existe");
        }
        System.out.println(file.getAbsoluteFile());

Path p2 = Paths.get("");
Path path = Path.of("files/fichero1.txt");
if (Files.exists(path)){
    System.out.println("EXISTE!!!");
}

        try {
            Files.write(path,"Soy Andrea".getBytes(),StandardOpenOption.APPEND);

            Files.writeString(path,"estoy en clase de ADA", StandardOpenOption.APPEND);
          List<String> lines = Files.readAllLines(path);
            System.out.println(lines.size());
            String textoTotal = Files.readString(path, StandardCharsets.UTF_8);
            System.out.println(textoTotal);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }

