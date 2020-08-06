package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewTask {
  public void newTask(String string) {
    try {
      Path filePath =
          Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\Tasks.txt");
      List<String> lines = Files.readAllLines(filePath);
      lines.add(string);
      Files.write(filePath, lines);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("File not found");
    }
  }
}