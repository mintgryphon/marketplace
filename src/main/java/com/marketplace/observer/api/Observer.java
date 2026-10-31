package com.marketplace.observer.api;

/**
 * Универсальный generic-интерфейс подписчика (Push-модель).
 */
@FunctionalInterface
public interface Observer<E extends Event> {
    void onEvent(E event);
}