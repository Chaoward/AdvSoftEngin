import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import advsoft.mediator.*;

public class MediatorTesting {
    @Test
    public void testMessaging() {
        ChatServer server = new MessegePlatform();
        User user1 = new User("Bob", server);
        User user2 = new User("Alice", server);
        User user3 = new User("Middle-Man", server);

        user1.sendMessage("Hello Alice!", "Alice");
        Message lastMsg = user2.getlastMessage();
        assertEquals(lastMsg.content, "Hello Alice!");
        assertEquals(lastMsg.sender, user1);
        assertArrayEquals(lastMsg.recipients, new User[] {user2});

        user2.sendMessage("Hello Bob!", "Bob");
        lastMsg = user1.getlastMessage();
        assertEquals(lastMsg.content, "Hello Bob!");
        assertEquals(lastMsg.sender, user2);
        assertArrayEquals(lastMsg.recipients, new User[] {user1});

        String[] recipients = new String[] {"Alice", "Middle-Man"};
        User[] expectedRecip = new User[] {user2, user3};
        user1.sendMessage("Let's do this!", recipients);
        lastMsg = user2.getlastMessage();
        assertEquals(lastMsg.content, "Let's do this!");
        assertEquals(lastMsg.sender, user1);
        assertArrayEquals(lastMsg.recipients, expectedRecip);
        lastMsg = user3.getlastMessage();
        assertEquals(lastMsg.content, "Let's do this!");
        assertEquals(lastMsg.sender, user1);
        assertArrayEquals(lastMsg.recipients, expectedRecip);
    }

    @Test
    public void testHistory() {
        ChatServer server = new MessegePlatform();
        User user1 = new User("Bob", server);
        User user2 = new User("Alice", server);

        user1.sendMessage("Hi!", "Alice");
        user2.sendMessage("Hi!", "Bob");
        user1.sendMessage("What's up?", "Alice");
        user2.sendMessage("The ceiling?", "Bob");
        
        Message lastMsg = user2.getlastMessage();
        assertEquals(lastMsg.content, "The ceiling?");
        assertEquals(lastMsg.sender, user2);

        user2.undoMessage();
        lastMsg = user2.getlastMessage();
        assertEquals(lastMsg.content, "What's up?");
        assertEquals(lastMsg.sender, user1);

        ArrayList<String> history = new ArrayList<String>();
        for (Message.Memento m : user1.getHistory()) {
            history.add(m.content + "@" + m.sender.getName());
        }

        assertArrayEquals(history.toArray(new String[history.size()]), new String[] {
            "Hi!@Bob",
            "Hi!@Alice",
            "What\'s up?@Bob",
            "The ceiling?@Alice"
        });

        user2.undoMessage();
        user2.undoMessage();
        assertEquals(user2.getlastMessage().content, "Hi!");
        assertEquals(user2.getlastMessage().sender.getName(), "Bob");
        user2.undoMessage();
        assertEquals(user2.getlastMessage(), null);
    }
}
