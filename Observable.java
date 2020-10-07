package util;

/**
 * Represents an object that can notify an Observer
 *
 * @param <T> the type of observer that can be registered
 */
public interface Observable<T> {
    /**
     * Register an additional observer to notify when an event occurs
     */
    void registerObserver(Observer<T> observer);
}
