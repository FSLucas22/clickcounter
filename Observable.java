public interface Observable<T> {
    void notify(T update);
    void subscribe(Observer<T> observer);
    void unsubscribe(Observer<T> observer);
}
