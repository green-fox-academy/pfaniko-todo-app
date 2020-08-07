package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NewTask {
  public static void newTask(String string) {
    Path filePath =
        Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\Assets\\Tasks.txt");
    String notDoneTask = "[ ] " + string + "\n";

    try {
      Files.write(filePath, notDoneTask.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      System.out.println("Can not write the file");
    }
  }
}