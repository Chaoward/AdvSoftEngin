package advsoft.mediator;

import java.util.ArrayList;

public class User {
    private ChatServer server;
    private String name;
    private ChatHistory history = new ChatHistory();
    private Message lastMessage;
    private ArrayList<User> blockList = new ArrayList<User>();
    

    public User(String name, ChatServer server) {
        this.name = name;
        this.server = server;
        this.lastMessage = new Message("", null, null, new User[0]);
    }


    public Message sendMessage(String content, String username) {
        Message msg = server.sendMessage(this, username, content);
        history.pushMessage(lastMessage);
        lastMessage.restore(msg.snapshot());
        return msg;
    }

    public Message sendMessage(String content, String[] usernames) {
        Message msg = server.sendMessage(this, usernames, content);
        history.pushMessage(lastMessage);
        lastMessage.restore(msg.snapshot());
        return msg;
    }


    public void receiveMessage(Message msg) {
        history.pushMessage(lastMessage);
        lastMessage.restore(msg.snapshot());
    }


    public void blockUser(User targetUser) {
        blockList.add(targetUser);
    }


    public void undoMessage() {
        Message.Memento memento = history.undoLast();
        lastMessage.restore(memento);
    }

    public void printHistory() {
        
    }

    public Message getlastMessage() {
        return lastMessage;
    }

    public String getName() {
        return name;
    }
} 
