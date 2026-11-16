package advsoft.mediator;

import java.util.Stack;

public class ChatHistory {
    final Stack<Message> history = new Stack<Message>();

    public Message getLastMessage() {
        return history.peek();
    }

    public Message[] getHistory() {
        Message[] temp = new Message[history.size()];
        return history.toArray(temp);
    }
}
