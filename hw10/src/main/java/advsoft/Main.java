package advsoft;

import java.util.Iterator;

import advsoft.mediator.*;


public class Main {
    public static void main(String[] args) {
        mediatorMementoIterator();

    }



    public static void mediatorMementoIterator() {
        ChatServer server = new MessegePlatform();

        User alice = new User("Alice", server);
        User bob = new User("Bob", server);

        alice.sendMessage("What\'s up, you got that doc up?", "Bob");
        alice.sendMessage("Still waiting on other stuff too.", "Bob");
        bob.sendMessage("Not yet, but very soon.", "Alice");
        alice.sendMessage("Okay, remember to get it done by tonight.", "Bob");
        bob.sendMessage("Maybe...", "Alice");

        printHistory(alice);

        bob.undoMessage();
        bob.sendMessage("I mean, will get it done!", "Alice");

        printHistory(bob);

        User middleman = new User("Middle-Man", server);
        String[] recips = new String[] {"Alice", "Bob"};
        middleman.sendMessage("Hey, what\'s up, hello!", recips);

        alice.sendMessage("Go away.", "Middle-Man");
        bob.sendMessage("Be gone.", "Middle-Man");
        alice.blockUser(middleman);
        bob.blockUser(middleman);

        middleman.sendMessage("What? Why?", recips);
        middleman.sendMessage("Hello?", recips);
        middleman.sendMessage("Anyone there?", recips);

        printHistory(middleman);
        printHistory(bob);
        printHistoryIter(alice, bob);
    }
    
    private static void printHistory(User user) {
        System.out.println("===== " + user.getName() + " History =====");
        for (Message.Memento msg : user.getHistory()) {
            System.out.print("[" + msg.sender.getName() + "->" + usersToStr(msg.recipients) + "]: ");
            System.out.print(msg.content);
            System.out.println(" (" + msg.timestamp + ")");
        }
    }

    private static void printHistoryIter(User userToPrint, User userToSearch) {
        Iterator<Message.Memento> iter = userToPrint.iterator(userToSearch);
        Message.Memento curMsg;
        System.out.println("===== " + userToPrint.getName() + "\'s History of " + userToSearch.getName() + " =====");
        while (iter.hasNext()) {
            curMsg = iter.next();
            System.out.print("[" + curMsg.sender.getName() + "->" + usersToStr(curMsg.recipients) + "]: ");
            System.out.print(curMsg.content);
            System.out.println(" (" + curMsg.timestamp + ")");
        }
    }

    private static String usersToStr(User[] users) {
        String results = "";
        for (User u : users) {
            results += u.getName() + "|";
        }
        return results;
    }
}