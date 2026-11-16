package advsoft.mediator;

public interface ChatServer {
    public void sendMessage(User sender, String recipient, String content);
    public void sendMessage(User sender, String[] recipients, String content);
    public void registerUser(User user);
    public void removeUser(User user);
    public void blockUser(User user, String userToBlock);
}
