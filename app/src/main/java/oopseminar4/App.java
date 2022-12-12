package oopseminar4;




import oopseminar4.data.Event;
import oopseminar4.service.EventService;
import java.util.Date;


public class App {
    
    public static void main(String[] args){

        Event event1 = new Event("sdsd", 3, 3, new Date(), "sd");
        Event event2 = new Event("dsds", 1, 2, new Date(), "sd");
        Event event3 = new Event("sdsd", 3, 3, new Date(), "sd");
        EventService ta = new EventService();
        ta.addNewTask(event1);
        ta.addNewTask(event2);
        ta.addNewTask(event3);
        for (Event event : ta.getTasks()) {
            System.out.println(event.getPriority());
            
        }
    }
}
