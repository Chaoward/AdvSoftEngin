package advsoft.mediator;

import java.util.ArrayList;

public class User {
    private ChatServer server;
    private String name;
    private ChatHistory history = new ChatHistory();
    private ArrayList<User> blockList = new ArrayList<User>();
    

    public User(String name, ChatServer server) {
        this.name = name;
        this.server = server;
        server.registerUser(this);
    }


    public Message sendMessage(String content, String username) {
        Message msg = server.sendMessage(this, username, content);
        history.pushMessage(msg);
        return msg;
    }

    public Message sendMessage(String content, String[] usernames) {
        Message msg = server.sendMessage(this, usernames, content);
        history.pushMessage(msg);
        return msg;
    }


    public void receiveMessage(Message msg) {
        history.pushMessage(msg);
    }


    public void blockUser(User targetUser) {
        blockList.add(targetUser);
    }


    public Message undoMessage() {
        return history.undoLast();
    }

    public Message.Memento[] getHistory() {
        return history.getHistory();
    }

    public Message getlastMessage() {
        return history.getLastMessage();
    }

    public String getName() {
        return name;
    }
} 
