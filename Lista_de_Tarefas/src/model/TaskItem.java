package model;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskItem {
    private String description;
    private boolean completed;


    public TaskItem(String description) {
        this.description = description;
        this.completed = false;
    }


    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }


    @Override

    public String toString(){
        return (completed ? "[x]" : "[ ]" + "" + description);
    }

}