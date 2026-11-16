package advsoft.mediator;

public class User {
    ChatServer server;
    String name;
    ChatHistory history = new ChatHistory();
    

    public User(String name, ChatServer server) {
        this.name = name;
        this.server = server;
    }


    public Message sendMessage(String content, String username) {
        return null;
    }

    public Message sendMessage(String content, String[] username) {
        return null;
    }


    public void receiveMessage(Message msg) {

    }


    public void undoMessage() {
        
    }

    public String[] getHistory() {
        return null;
    }

    public Message getlastMessage() {
        return null;
    }

    public String getName() {
        return name;
    }
} 
