package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintUsage {
  public static void main(String[] args) {
    try {
      Path filePath =
          Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\UsageText.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("No such file exists");
    }
  }
}