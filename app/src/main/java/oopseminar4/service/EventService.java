package oopseminar4.service;

import java.util.Queue;
import java.util.PriorityQueue;
import oopseminar4.data.Event;;

public class EventService {
    //
    private Queue<Event> tasks;
    

    //Constructor EventService
    public EventService(){
        this.tasks = new PriorityQueue<>();

    }


    public Queue<Event> getTasks() {
        return this.tasks;
    }


    public void setTasks(Queue<Event> importantTasks) {
        this.tasks = importantTasks;
    }
    
    public void addNewTask(Event newTask){
        getTasks().add(newTask);
    }
}
