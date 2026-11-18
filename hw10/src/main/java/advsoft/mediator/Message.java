package advsoft.mediator;

import java.util.Date;

public class Message {
    public String content;
    public Date timestamp;
    public User sender;
    public User[] recipients;

    public Message(String content, Date timestamp, User sender, User recipients) {
        this.content = content;
        this.timestamp = timestamp;
        this.sender = sender;
        this.recipients = new User[] {recipients};
    }

    public Message(String content, Date timestamp, User sender, User[] recipients) {
        this.content = content;
        this.timestamp = timestamp;
        this.sender = sender;
        this.recipients = recipients;
    }


    public Memento snapshot() {
        return new Memento(content, timestamp, sender, recipients);
    }

    public void restore(Memento memento) {
        this.content = memento.content;
        this.timestamp = memento.timestamp;
        this.sender = memento.sender;
        this.recipients = memento.recipients;
    }


    @Override 
    public boolean equals(Object o) {
        Message msg = (Message)o;
        return this.content == msg.content &&
            this.timestamp == msg.timestamp &&
            this.sender == msg.sender &&
            this.recipients == msg.recipients;
    }


    public class Memento {
        public final String content;
        public final Date timestamp;
        public final User sender;
        public final User[] recipients;

        public Memento(String content, Date timestamp, User sender, User[] recipients) {
            this.content = content;
            this.timestamp = timestamp;
            this.sender = sender;
            this.recipients = recipients;
        }
    }
}
