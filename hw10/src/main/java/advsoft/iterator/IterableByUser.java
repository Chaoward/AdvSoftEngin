package advsoft.iterator;
import advsoft.mediator.User;
import java.util.Iterator;

public interface IterableByUser {
    Iterator iterator(User userToSearchWith);
}
