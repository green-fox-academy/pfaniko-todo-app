package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTasks {
  public void listTasks() {
    Path filePath =
        Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\Assets\\Tasks.txt");
    List<String> tasks = new ArrayList<>();

    try {
      tasks = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("File not found");
    }

    if (tasks.isEmpty()) {
      System.out.println("No todos for today! :)");
    } else {
      int lineCounter = 1;
      for (String task : tasks) {
        System.out.println(lineCounter + " - " + task);
        lineCounter++;
      }
    }
  }
}