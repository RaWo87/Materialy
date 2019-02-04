package sda.ToDoListDemo1;

public class TDL_Tester {


    public static void main(String[] args) {
        ToDoLista kalendarz = new ToDoLista();

        kalendarz.addTask(new Task("task1","rob cos1",Priorities.HIGH));
        kalendarz.addTask(new Task("task2","rob cos2",Priorities.MID));
        kalendarz.addTask(new Task("task3","rob cos3",Priorities.HIGH));
        kalendarz.addTask(new Task("task4","rob cos4",Priorities.LOW));
        System.out.println(kalendarz.returnALLTasks());
        for(Task x: kalendarz.returnALLTasks()){
            System.out.println(x.getName());
        }

    }
}
