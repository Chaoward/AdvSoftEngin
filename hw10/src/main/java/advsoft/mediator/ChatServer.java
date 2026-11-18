package advsoft.mediator;

public interface ChatServer {
    public Message sendMessage(User sender, String recipient, String content);
    public Message sendMessage(User sender, String[] recipients, String content);
    public void registerUser(User user);
    public void removeUser(User user);
}
