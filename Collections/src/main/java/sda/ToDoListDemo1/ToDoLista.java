package sda.ToDoListDemo1;

import java.time.LocalDate;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


class Task{
String name;
String description;
LocalDate begin;
LocalDate deadline;
Priorities priority;

Task(String name, String desc, Priorities priority){
    this.name=name;
    this.description=desc;
    this.begin = LocalDate.now();
    this.deadline = LocalDate.of(20,2,19);
    this.priority = priority;
}
public String getName(){
    return  name;
}
public String getDesc(){
    return description;
}

}
public class ToDoLista {
    Deque<Task> Lista = new LinkedList<>();
    public void addTask(Task task){
        Lista.add(task);
    }

    public void firstToLast(){
        Task temp = Lista.pollFirst();
        Lista.addLast(temp);
    }
    public Task checkFirst(){
        return Lista.peekFirst();
    }

    public Set<Task> returnALLTasks(){
        Set<Task> tempSet= new HashSet<>();
        tempSet.addAll(Lista);
        return tempSet;
        
    }
}

