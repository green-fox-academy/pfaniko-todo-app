package ToDoApp;

import java.util.Arrays;

public class ToDoMain {
  public static void main(String[] args) {
    if (args.length == 0) {
      PrintUsage.printUsage();
    } else {
      for (String arg : args) {
        if (arg.equals("-l")) {
          ListTasks.listTasks();
        } else if (arg.equals("-a")) {
          try {
            int indexArg = Arrays.asList(args).indexOf(arg);
            String nextArg = args[indexArg + 1];
            NewTask.newTask(nextArg);
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unable to add: no task provided");
          }
        } else if (arg.equals("-r")) {
          try {
            int indexArg = Arrays.asList(args).indexOf(arg) + 1;
            int index = Integer.parseInt(args[indexArg]);
            RemoveTask.removeTask(index);
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unable to remove: no index provided");
          } catch (NumberFormatException e) {
            System.out.println("Unable to remove: index is not a number");
          } catch (IndexOutOfBoundsException e) {
            System.out.println("Unable to remove: index is out of bound");
          }
        } else if (arg.equals("-c")) {
          int indexArg = Arrays.asList(args).indexOf(arg) + 1;
          int index = Integer.parseInt(args[indexArg]);
          CheckTask.checkTask(index);
        }
      }
    }
  }
}