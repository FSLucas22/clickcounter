@FunctionalInterface
public interface Observer<T> {
    void receiveUpdate(T update);
}
