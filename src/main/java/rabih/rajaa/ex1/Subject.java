package rabih.rajaa.ex1;

/**
 * Subject interface - Observer Pattern
 * Defines the interface for subjects that can be observed.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
