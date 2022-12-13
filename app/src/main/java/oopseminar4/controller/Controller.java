package oopseminar4.controller;

import oopseminar4.data.Event;
import oopseminar4.service.EventService;
import oopseminar4.view.View;
import oopseminar4.service.ImportEventService;;

public class Controller {
    EventService eventService = new EventService();
    View view = new View();
    //Создаём новую задачу
    public void createNewTask(Event newTask){
        eventService.addNewTask(newTask);
        view.newEvent(newTask);
    }

    //Импорт Задач из файла
    public void importTasksFromFile(String fileName){
        ImportEventService newTasks = new ImportEventService(fileName);
        eventService.getTasks().addAll(newTasks.importTaskFromFile(fileName));
        view.importFileComplete(fileName);

    }


}
