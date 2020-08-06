package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RemoveTask {
  public void removeTask(int index) {
    try {
      Path filePath =
          Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\Tasks.txt");
      List<String> lines = Files.readAllLines(filePath);
      lines.remove(index);
      Files.write(filePath, lines);

    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("File not found");
    }
  }
}