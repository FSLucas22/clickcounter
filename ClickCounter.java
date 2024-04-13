import java.util.ArrayList;
import java.util.List;

public class ClickCounter implements Observable<Integer> {
    private Integer clickCount = 0;

    private final List<Observer<Integer>> observers = new ArrayList<>();

    @Override
    public void notify(Integer update) {
        observers.forEach(observer -> observer.receiveUpdate(update));
    }

    @Override
    public void subscribe(Observer<Integer> observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer<Integer> observer) {
        observers.remove(observer);
    }

    public void click() {
        clickCount++;
        notify(clickCount);
    }
}
