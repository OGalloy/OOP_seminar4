package oopseminar4.view;

import oopseminar4.data.Event;

public class View {
    public void newEvent(Event event){
        System.out.println(String.format("New Event was created\n" + event.toString()));
    }

    public void importFileComplete(String fileName){
        System.out.println(String.format("$s Import complete", fileName ));

    }
}
