package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RemoveTask {
  public void removeTask(int index) {
    Path filePath =
        Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\Assets\\Tasks.txt");
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("File not found");
    }

    lines.remove(index);

    try {
      Files.write(filePath, lines);
    } catch (IOException e) {
      System.out.println("Can not write the file");
    }
  }
}