package ToDoApp;

public class ToDoMain {
  public static void main(String[] args) {
    if (args.length == 0) {
      PrintUsage.printUsage();
    } else if (args[0].equals("-l")) {
      ListTasks.listTasks();
    } else if (args[0].equals("-a")) {
      try {
        String nextArg = args[1];
        NewTask.newTask(nextArg);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Unable to add: no task provided");
      }
    } else if (args[0].equals("-r")) {
      try {
        RemoveTask.removeTask(Integer.parseInt(args[1]));
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Unable to remove: no index provided");
      } catch (NumberFormatException e) {
        System.out.println("Unable to remove: index is not a number");
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Unable to remove: index is out of bound");
      }
    } else if (args[0].equals("-c")) {
      try {
        CheckTask.checkTask(Integer.parseInt(args[1]));
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Unable to check: no index provided");
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Unable to check: index is out of bound");
      } catch (NumberFormatException e) {
        System.out.println("Unable to check: index is not a number");
      }
    } else {
      System.out.println("Unsupported argument");
    }
  }
}