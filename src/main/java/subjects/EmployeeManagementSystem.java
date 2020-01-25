package subjects;

import domain.Employee;
import domain.EmployeeDAO;
import observers.IObserver;
import subjects.ISubject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {

    private List<IObserver> observers;
    private List<Employee> employees;

    private EmployeeDAO employeeDAO;

    private Employee employee;
    private String msg;

    public EmployeeManagementSystem(){
        observers = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }


    public void registerObserver(IObserver o){
        observers.add(o);
    }

    public void unregisterObserver(IObserver o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(IObserver departments : observers){
            departments.callMe(employee, msg);
        }
    }

    public void hireNewEmployee(Employee emp){
        employee = emp;
        msg = "New Hire: ";
        employees.add(emp);
        notifyObservers();
    }
}
