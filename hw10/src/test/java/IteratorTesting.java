import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import advsoft.mediator.ChatServer;
import advsoft.mediator.Message;
import advsoft.mediator.MessegePlatform;
import advsoft.mediator.User;

public class IteratorTesting {
    
    @Test
    public void testIteration() {
        ChatServer server = new MessegePlatform();
        User user1 = new User("Alice", server);
        User user2 = new User("Bob", server);

        user1.sendMessage("one", "Bob");
        user2.sendMessage("two", "Alice");
        user1.sendMessage("three", "Bob");
        user2.sendMessage("four", "Alice");

        Iterator<Message.Memento> iter = user1.iterator(user2);
        assertTrue(iter.hasNext());
        assertEquals(iter.next().content, "two");
        assertEquals(iter.next().content, "four");

        User user3 = new User("Middle-Man", server);
        Iterator<Message.Memento> iter2 = user2.iterator(user3);
        assertFalse(iter2.hasNext());
        assertThrows(NoSuchElementException.class, () -> iter2.next());
    }
}
