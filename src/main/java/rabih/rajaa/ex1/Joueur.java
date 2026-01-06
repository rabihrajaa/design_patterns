package rabih.rajaa.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Joueur class - Subject in Observer Pattern
 * Represents a player with a score, notifies observers when score changes.
 */
public class Joueur implements Subject {
    private int score;
    private List<Observer> observers = new ArrayList<>();

    public void setScore(int score) {
        this.score = score;
        notifyObservers();
    }

    public int getScore() {
        return score;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(score);
        }
    }
}
