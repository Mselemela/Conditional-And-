import java.util.ArrayList;

class ToDo {
    
    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<String>();
            String toDo1 = "Water plants";

            String toDo2 = "Take a walk";
            String toDo3 = "Have breakfast";

            toDoList.add(toDo1);
            toDoList.add(toDo2);
            toDoList.add(toDo3);

            System.out.println(toDoList);
        
    }
}