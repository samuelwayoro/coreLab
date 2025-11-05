package corelab.structures_de_donnees.programmationfonctionnelle.lesstream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamSurFichier {
    public static void main(String[]args) throws IOException {
        Stream<String> contenuFichier = Files.lines(Paths.get("D:/javaProjects/java_dojo/src/main/java/org/example/","fichier.txt"));
        contenuFichier.forEach(System.out::println);
    }
}
