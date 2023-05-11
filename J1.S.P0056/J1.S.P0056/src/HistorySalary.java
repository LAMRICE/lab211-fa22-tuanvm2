
import java.time.LocalDate;
import java.util.Date;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class HistorySalary extends Worker{
    private String Status;
    private String Date;

    public HistorySalary() {
    }

    public HistorySalary(String id, String name, int age, double salary, String workLocation, String Status, String Date) {
        super(id, name, age, salary, workLocation);
        this.Status = Status;
        this.Date = Date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    

    

    @Override
    public String toString() {
        return String.format("%-8s%-15s%-6d%-10f%-15s%-10s", id, name, age, salary, Status, Date);
    }

   
    
    
    
}
