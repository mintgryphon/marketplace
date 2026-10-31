package com.marketplace.observer.api;

/**
 * Универсальный generic-интерфейс издателя событий.
 */
public interface Subject<E extends Event> {
    void subscribe(EventType eventType, Observer<E> observer);
    void unsubscribe(EventType eventType, Observer<E> observer);
    void notifyObservers(E event);
}