public class TodoMain {

    public static String usage = "Command Line Todo application\n" +
            "=============================\n" +
            "\n" +
            "Command line arguments:\n" +
            " -l   Lists all the tasks\n" +
            " -a   Adds a new task\n" +
            " -r   Removes an task\n" +
            " -c   Completes an task";

    public static String test = "testing";
    public static String testing2 = "testing2";

    public static void main(String[] args) {
        args[0] = "-l";
       // args[1] = "1";
       // ToDoList myToDoList = new ToDoList();
       /*
        myToDoList.setToDoList("1. GG");
        myToDoList.setToDoList("2. GG");
        */

     //  WriteFile.writingTo("41.t5ask",myToDoList);
     //  WriteFile.writingTo("24.tdfask",myToDoList);

        if (args.length == 0){
            System.out.println("Argument not found");

        }



         if (args[0].equals("-l")) {

             System.out.println("Testing -l");
             ToDoList myToDoList = new ToDoList();
             ReadFile.readToTheToDoList(myToDoList);
             myToDoList.printOutToDoList();
         }

        if (args[0].equals("-a")) {
            System.out.println("Testing -a");
            ToDoList myToDoList = new ToDoList();
            String mzString;
            mzString = args[1];
            WriteFile.writingTo(mzString,myToDoList);


        }

        if (args[0].equals("-r")) {
            int myInt = Integer .parseInt(args[1]);
            System.out.println(myInt);
            ToDoList myToDoList = new ToDoList();
            ReadFile.readToTheToDoList(myToDoList);

            myToDoList.deleteTask(myInt);
            myToDoList.printOutToDoList();
            WriteFile.writingTo2(myToDoList);


        }

        System.out.println("Somethign went wrong");
    }
}
