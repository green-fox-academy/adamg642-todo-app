import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {
   // public static void main(String[] args) {


     public static void readToTheToDoList(ToDoList toDoList){
        try { // Required by Files.readAllLines(filePath);
            // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
            Path filePath = Paths.get("../data.txt");
            List<String> lines = Files.readAllLines(filePath);
            if (lines.isEmpty()){
                System.out.println("No task");
            }
            toDoList.setReadAllLineToTheToDoList(lines);

        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }
}