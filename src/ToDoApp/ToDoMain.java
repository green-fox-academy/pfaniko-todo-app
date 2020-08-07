package ToDoApp;

import java.util.Arrays;

public class ToDoMain {
  public static void main(String[] args) {
    PrintUsage printUsage = new PrintUsage();
    ListTasks listTasks = new ListTasks();
    NewTask newTask = new NewTask();
    RemoveTask removeTask = new RemoveTask();

    if (args.length == 0) {
      printUsage.printUsage();
    } else {
      for (String arg : args) {
        switch (arg) {
          case "-l":
            listTasks.listTasks();
            break;
          case "-a":
            try {
              int indexArg = Arrays.asList(args).indexOf(arg);
              String nextArg = args[indexArg + 1];
              newTask.newTask(nextArg);
            } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("Unable to add: no task provided");
            }
            break;
          case "-r":
            try {
              int indexArg = Arrays.asList(args).indexOf(arg) + 1;
              int index = Integer.parseInt(args[indexArg]);
              removeTask.removeTask(index);
            } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("Unable to remove: no index provided");
            } catch (NumberFormatException e) {
              System.out.println("Unable to remove: index is not a number");
            } catch (IndexOutOfBoundsException e) {
              System.out.println("Unable to remove: index is out of bound");
            }
            break;
          default:
            System.out.println("\nUnsupported argument\n");
            printUsage.printUsage();
            break;
        }
      }
    }
  }
}