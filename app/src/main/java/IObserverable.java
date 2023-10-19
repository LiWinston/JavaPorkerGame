import java.util.List;

public interface IObserverable  {
    void addObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
