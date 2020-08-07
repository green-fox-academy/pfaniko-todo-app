package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CheckTask {
  public void checkTask(int index) {
    Path filePath =
        Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\Assets\\Tasks.txt");
    List<String> tasks = new ArrayList<>();

    try {
      tasks = Files.readAllLines(filePath);
    } catch (
        IOException e) {
      e.printStackTrace();
    }

    String originalTask = tasks.get(index);
    String checkedTask = "[x]" + originalTask.substring(3);
    tasks.set(index, checkedTask);


    try {
      Files.write(filePath, tasks);
    } catch (IOException e) {
      System.out.println("Can not write the file");
    }
  }

  public static boolean isDone(String task) {
    return task.contains("[ ]");
  }
}