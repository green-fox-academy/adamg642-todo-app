import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<String> toDoList = new ArrayList<>();
    private int counter = 0;
    public void setToDoList(String addToList){
        toDoList.add(addToList);

    }

    public List<String> getToDoList (){

        return toDoList;
    }

    public void setReadAllLineToTheToDoList (List<String> lines){
        toDoList = lines;

    }

    public void printOutToDoList (){
        for (String task: toDoList
             ) {
            String myString;
            counter++;

            myString = counter +".)  "+ task;
            System.out.println(myString);
        }
    }

    public int sizeOfToDoList(){
        int size = 0;
        size = toDoList.size();

        return size;
    }

    public void deleteTask (int number){
        toDoList.remove(number);

    }


}
