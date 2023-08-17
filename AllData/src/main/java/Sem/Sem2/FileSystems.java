package Sem.Sem2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileSystems {

    public static void main(String[] args) throws IOException {
        // 1. Найти и скинуть презентацию
        // 2. Материалы по java.io.*

        // IdeaProjects/gb/python-from-java/python-scripts
//        Path python = Path.of("/Users/inchestnov/IdeaProjects/gb/python-from-java/python-scripts/hello-world.py");
        Path python = Path.of("../python-from-java/python-scripts/hello-world.py");
        System.out.println(Files.readString(python));
//
//        LocalDateTime now = LocalDateTime.now();
//        // год-месяц-день час:минуты
//        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
//        System.out.println(format);


        // [java proc  |                 | file]
//        File file = new File("root/dir/file.txt");
//        FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write("first"); //
//        fileWriter.write("second"); //
//        fileWriter.write("third"); //
//        fileWriter.flush();
//        fileWriter.close();

        // java FilesSystems.class
        System.out.println(System.getProperty("user.dir"));

        // java.io InputOutput

        // root/dir/file.txt

        Path dir = Path.of("root", "dir");
        if (Files.notExists(dir)) {
            Files.createDirectories(dir);
        }

//        Path file = Path.of("root", "dir", "file.txt");
//        if (Files.notExists(file)) {
//            Files.createFile(file);
//        }
//
//        Files.writeString(file, "contentcontent");
//
//        String content = "фвдавыдафвыафэдвыафтвыда";
//        byte[] bytes = content.getBytes();
//        Files.write(file, bytes);

//        String content = Files.readString(file);
//        System.out.println(content);

    }

}
