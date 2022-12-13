package oopseminar4;




import oopseminar4.data.Event;
//import oopseminar4.service.EventService;
//import java.time.LocalDateTime;
import oopseminar4.controller.Controller;;


public class App {
    
    public static void main(String[] args){

        Event event1 = new Event("sdsd", 3, 3, null, "sd");
        Event event2 = new Event("dsds", 1, 2, null, "sd");
        Event event3 = new Event("sdsd", 3, 3, null, "sd");
        Controller controller = new Controller();
        controller.createNewTask(event3);
        controller.createNewTask(event2);
        controller.createNewTask(event1);
    }
}
