package view;
import model.TaskItem;
import model.TaskList;
import java.util.Scanner;

public class TaskApp {
    private static Scanner scanner = new Scanner(System.in);
    private static TaskList taskList = new TaskList();

    public static void taskAppMainLoop(){
        boolean exit = false;

        while (!exit){
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addTask();
                    break;
                case 2:
                    markTaskAsCompleted();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    displayTasks();
                    break;
                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void displayMenu(){
        System.out.println("Menu");
        System.out.println("1) Adicionar tarefa.");
        System.out.println("2) Marcar tarefa como feita.");
        System.out.println("3) Remover tarefa.");
        System.out.println("4) Exibir tarefas.");
        System.out.println("5) Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void addTask(){
        System.out.println("Digite a tarefa: ");
        String description = scanner.nextLine();
        TaskItem task = new TaskItem(description);
        taskList.addTask(task);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    private static void markTaskAsCompleted(){
        taskList.displayTasks();
        System.out.println("Digite o número da tarefa para concluir:");
        int index = scanner.nextInt();
        taskList.markTaskAsCompleted(index);
        System.out.println("tarefa marcada como concluida.");
    }

    private static void removeTask(){
        taskList.displayTasks();
        System.out.println("Digite o número da tarefa que deseja remover:");
        int index = scanner.nextInt();
        taskList.removeTask(index);
        System.out.println("Tarefa removida.");
    }

    private static void displayTasks(){
        taskList.displayTasks();
    }
}
