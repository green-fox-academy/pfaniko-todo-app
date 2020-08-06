package ToDoApp;

public class ToDoMain {
  public static void main(String[] args) {
    PrintUsage printUsage = new PrintUsage();
    ListTasks listTasks = new ListTasks();

    if (args.length == 0) {
      printUsage.printUsage();
    } else {
      for (String arg : args) {
        if (arg.equals("-l")) {
          listTasks.listTasks();
        }
      }
    }
  }
}