package subjects;

import domain.Employee;
import observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public interface ISubject {

    public void registerObserver(IObserver o);
    public void unregisterObserver(IObserver o);
    public void notifyObservers();

}
