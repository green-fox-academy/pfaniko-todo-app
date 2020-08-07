package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckTask {
  public void checkTask(int index) {
    try {
      Path filePath =
          Paths.get("C:\\Users\\anhen\\Documents\\greenfox\\pfaniko-todo-app\\Assets\\Tasks.txt");
      List<String> tasks = Files.readAllLines(filePath);
      String originalTask = tasks.get(index);
      String checkedTask = "[x]" + originalTask.substring(3);
      tasks.set(index, checkedTask);
      Files.write(filePath, tasks);
    } catch (
        IOException e) {
      e.printStackTrace();
    }
  }

  public static boolean isDone(String task) {
    return task.contains("[ ]");
  }
}