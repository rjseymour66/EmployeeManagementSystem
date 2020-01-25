package observers;

import domain.Employee;
import observers.IObserver;

public class HRDepartment implements IObserver {

    public void callMe(Employee emp, String msg){
        System.out.println("HR Department notified...");
        System.out.println(msg + " " + emp.getName());
    }
}
