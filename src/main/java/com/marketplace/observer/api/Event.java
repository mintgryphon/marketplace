package com.marketplace.observer.api;

import java.time.Instant;

/**
 * Базовый маркерный интерфейс для всех неизменяемых событий.
 */
public interface Event {
    EventType getEventType();
    Instant getTimestamp();
}