package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NewTask {
  public void newTask(String string) {
    try {
      Path filePath =
          Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\Tasks.txt");
      Files.write(filePath, string.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("File not found");
    }
  }
}