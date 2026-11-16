package advsoft.mediator;

import java.sql.Timestamp;

public class Message {
    public String content;
    public Timestamp timestamp;
    public User sender;
    public User[] recipients;
}
