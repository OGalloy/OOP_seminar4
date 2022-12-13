package oopseminar4.service;

import java.util.ArrayList;
import java.util.List;
import oopseminar4.data.*;

public class ImportEventService {
    private String fileName;
    public ImportEventService(String fileName){
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<Event> importTaskFromFile(String fileName) {

        return new ArrayList<>();
    }
}
