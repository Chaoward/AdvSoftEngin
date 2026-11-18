package advsoft.mediator;

import java.util.Date;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class MessegePlatform implements ChatServer {
    private ArrayList<User> users = new ArrayList<User>();

    @Override
    public Message sendMessage(User sender, String recipient, String content) throws NoSuchElementException {
        User recipUser = findUser((u) -> u.getName() == recipient);

        Message msg = new Message(
            content,
            new Date(), 
            sender,
            recipUser
        );
        recipUser.receiveMessage(msg);

        return msg;
    }

    @Override
    public Message sendMessage(User sender, String[] recipients, String content) {
        User[] recipList = findUsers((u) -> {
            for (String name : recipients) {
                if (u.getName() == name)
                    return true;
            }
            return false;
        });

        Message msg = new Message(content, new Date(), sender, recipList);
        for (User user : recipList) {
            user.receiveMessage(msg);
        }

        return msg;
    }



    @Override
    public void registerUser(User user) {
        try {
            findUser((u) -> u == user);
        } catch (NoSuchElementException err) {
            users.add(user);
        }
    }



    @Override
    public void removeUser(User user) {
        users.remove(user);
    }




    private User findUser(Predicate<User> predicate) throws NoSuchElementException {
        for (User u : users) {
            if (predicate.test(u))
                return u;
        }

        throw new NoSuchElementException("User Not Found!");
    }



    private User[] findUsers(Predicate<User> predicate) {
        ArrayList<User> foundList = new ArrayList<User>();

        for (User u : users) {
            if (predicate.test(u))
                foundList.add(u);
        }

        return foundList.toArray(new User[foundList.size()]);
    }
}
