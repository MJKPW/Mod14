package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notification();
    void removeObserver(Observer observer);
}
