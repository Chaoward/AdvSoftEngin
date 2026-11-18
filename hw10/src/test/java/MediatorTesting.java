import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import advsoft.mediator.*;

public class MediatorTesting {
    @Test
    public void testMessaging() {
        ChatServer server = new MessegePlatform();
        User user1 = new User("Bob", server);
        User user2 = new User("Alice", server);
        User user3 = new User("Middle-Man", server);

        server.registerUser(user1);
        server.registerUser(user2);
        server.registerUser(user3);

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
}
