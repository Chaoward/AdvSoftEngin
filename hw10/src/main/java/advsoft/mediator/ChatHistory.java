package advsoft.mediator;

import java.util.Stack;

public class ChatHistory {
    final Stack<Message.Memento> history = new Stack<Message.Memento>();

    public Message.Memento getLastMessage() {
        return history.peek();
    }

    public void pushMessage(Message msg) {
        history.push(msg.snapshot());
    }

    public Message.Memento undoLast() {
        return history.pop();
    }

    public Message[] getHistory() {
        Message[] temp = new Message[history.size()];
        return history.toArray(temp);
    }
}
