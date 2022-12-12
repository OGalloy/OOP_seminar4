/*С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.

Например:
определить уровень приоритетов: низкий, средний, немедленное выполнение
выделить компоненту для хранения данных
выделить компоненту для организации импорта\экспорта данных
Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
данные хранятся в файле csv/jsom/xml
другие компоненты*/


package oopseminar4.data;
import java.util.Date;

public class Event implements Comparable<Event>{
    
    //Поля класса Event
    private String task;
    private Integer priority;
    private Integer id;
    private Date deadLine;
    private String autor;

    
    //Конструктор класса Event
    public Event(String task, Integer priority, Integer id, Date deadLIne, String autor) {
        this.task = task;
        this.priority = priority;
        this.id = id;
        this.deadLine = deadLIne;
        this.autor = autor;
    }
    
    //Методы класса
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public Integer getPriority() {
        return priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    //Сравниваем Евенты по приоритету
    @Override
    public int compareTo(Event o) {
        
        return this.getPriority().compareTo(o.getPriority());
    }

    
}   
    