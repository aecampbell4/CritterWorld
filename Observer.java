package util;

/**
 * Represents an observer that observes a number of Observable objects
 *
 * @param <T> the type of event to notify
 */
public interface Observer<T> {
    /**
     * Call this method in the observable when an event is ready to send to the Observer
     */
    void notify(T event);
}
