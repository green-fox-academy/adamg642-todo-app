import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;

public class WriteFile {
  //  public static void main(String[] args) {

    private static ArrayList<String> todoList = new ArrayList<>();





      public static void writingTo (String addToList,ToDoList myToDoList){
        List<String> content = new ArrayList();
        int counter = 1;
        ReadFile.readToTheToDoList(myToDoList);
          for (String task:myToDoList.getToDoList()
               ) {
              content.add(task);
          }

         /* for (int i = 0; i < myToDoList.sizeOfToDoList();i++){
              content.add(i+1+" ");

          }*/

        content.add(addToList);


          for (String word:content
               ) {

              myToDoList.setToDoList(word);

          }

        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Path filePath = Paths.get("../data.txt");
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }

    public static void writingTo2 (ToDoList myToDoList){
        List<String> content = new ArrayList();
        int counter = 1;
      //  ReadFile.readToTheToDoList(myToDoList);
        for (String task:myToDoList.getToDoList()
        ) {
            content.add(task);
        }

         /* for (int i = 0; i < myToDoList.sizeOfToDoList();i++){
              content.add(i+1+" ");

          }*/




        for (String word:content
        ) {

            myToDoList.setToDoList(word);

        }

        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Path filePath = Paths.get("../data.txt");
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}