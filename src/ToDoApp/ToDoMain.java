package ToDoApp;

import java.util.Arrays;

public class ToDoMain {
  public static void main(String[] args) {
    PrintUsage printUsage = new PrintUsage();
    ListTasks listTasks = new ListTasks();
    NewTask newTask = new NewTask();

    if (args.length == 0) {
      printUsage.printUsage();
    } else {
      for (String arg : args) {
        if (arg.equals("-l")) {
          listTasks.listTasks();
        } else if (arg.startsWith("-a")) {
          try {
            int indexArg = Arrays.asList(args).indexOf(arg);
            String nextArg = args[indexArg + 1];
            newTask.newTask(nextArg);
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unable to add: no task provided");
          }
        }
      }
    }
  }
}