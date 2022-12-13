package oopseminar4.service;

import java.util.ArrayList;
import java.util.List;
import oopseminar4.data.Event;;

public class EventService {
    //Лист Задач
    private List<Event> tasks;
    

    //Constructor EventService
    public EventService(){
        this.tasks = new ArrayList<>();

    }


    public List<Event> getTasks() {
        return this.tasks;
    }


    public void setTasks(List<Event> importantTasks) {
        this.tasks = importantTasks;
    }
    
    //Добавить событие в Лист задач.
    public void addNewTask(Event newTask){
        getTasks().add(newTask);
    }
}
