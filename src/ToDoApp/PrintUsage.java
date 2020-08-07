package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintUsage {
  public static void printUsage() {
    Path filePath =
        Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\Assets\\UsageText.txt");
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("File not found");
    }

    for (String line : lines) {
      System.out.println(line);
    }
  }
}