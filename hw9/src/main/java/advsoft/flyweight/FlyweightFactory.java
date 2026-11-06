package advsoft.flyweight;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public abstract class FlyweightFactory<T> {
    protected ArrayList<T> pool = new ArrayList<T>();

    protected T get(Predicate<T> predicate) throws NoSuchElementException  {
        for (T c : pool) {
            if (predicate.test(c))
                return c;
        }

        throw new NoSuchElementException();
    }
}
