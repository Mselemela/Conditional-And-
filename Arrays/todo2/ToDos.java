import java.util.ArrayList;

class ToDos {

    public static void main(String[] args) {

        //Sherlock's To-Do List
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("Vist the crie scene");
        sherlocksToDos.add("Play the violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("Solve the case");
        sherlocksToDos.add("Apprehend the criminal");

        //Poirot's To-Do List
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("Visit the crime scene");
        poirotsToDos.add("Interview suspects");
        poirotsToDos.add("Let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // Print the size of each ArrayList
        System.out.println(sherlocksToDos.size());
        System.out.println(poirotsToDos.size());

        // Print the name of the detective with the larger to-do list
        if (sherlocksToDos.size() > poirotsToDos.size()) {
            System.out.println("Sherlock");
        }
        else {
            System.out.println("Poirot");
        }

        }
    }
