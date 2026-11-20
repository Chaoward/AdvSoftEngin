package advsoft.mediator;

import java.util.Iterator;
import java.util.Stack;
import advsoft.iterator.IterableByUser;
import advsoft.iterator.SearchMessagesByUser;

public class ChatHistory implements IterableByUser {
    private final Stack<Message.Memento> history = new Stack<Message.Memento>();
    private Message lastMessage;

    public Message getLastMessage() {
        return lastMessage;
    }

    public void pushMessage(Message msg) {
        if (lastMessage != null) {
            history.push(lastMessage.snapshot());
        }
        else {
            lastMessage = new Message(msg.content, msg.timestamp, msg.sender, msg.recipients);
            return;
        }
        lastMessage.restore(msg.snapshot());
    }

    public Message undoLast() {
        if (history.size() < 1) {
            lastMessage = null;
            return null;
        }
        lastMessage.restore(history.pop());
        return lastMessage;
    }

    public Message.Memento[] getHistory() {
        Message.Memento[] temp = new Message.Memento[history.size()+1];
        temp = history.toArray(temp);
        temp[history.size()] = lastMessage.snapshot();
        return temp;
    }

    @Override
    public Iterator<Message.Memento> iterator(User userToSearchWith) {
        Stack<Message.Memento> copy = new Stack<Message.Memento>();
        copy.addAll(history);
        copy.push(lastMessage.snapshot());
        return new SearchMessagesByUser(userToSearchWith, copy);
    }
}
