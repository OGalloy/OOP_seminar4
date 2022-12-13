package oopseminar4.parser;

import java.util.List;

import oopseminar4.data.Event;

public interface Parser {
    public List<Event> parseFile(String fileName);
    
}
