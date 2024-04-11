package model;
import java.util.ArrayList;

public class TaskList {
    private ArrayList<TaskItem> tasks;

    public TaskList(){
        tasks = new ArrayList<>();
    }

    public void addTask( TaskItem task ){
        tasks.add(task);
    }

    public void removeTask( int index){
        tasks.remove(index);
    }

    public void markTaskAsCompleted(int index){
        tasks.get(index).markAsCompleted();
    }

    public void displayTasks(){
        if (tasks.isEmpty()){
            System.out.println("A lista de tarefas está vazia.");
        }else {
            System.out.println("Lista de tarefas: ");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ") " + tasks.get(i));
            }
        }
    }
}
