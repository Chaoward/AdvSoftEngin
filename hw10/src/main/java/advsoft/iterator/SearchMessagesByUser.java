package advsoft.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import advsoft.mediator.Message;
import advsoft.mediator.User;



public class SearchMessagesByUser implements Iterator<Message.Memento> {
    private List<Message.Memento> history;
    private Integer[] indexes;
    private int curSubIndex = -1;

    public SearchMessagesByUser(User userToSearch, List<Message.Memento> history) {
        this.history = history;
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (Message.Memento msg : history) {
            if (msg.sender == userToSearch) {
                temp.add(history.indexOf(msg));
            }
        }
        indexes = new Integer[temp.size()];
        indexes = temp.toArray(indexes);
    }



    @Override
    public boolean hasNext() {
        return curSubIndex + 1 < indexes.length;
    }

    @Override
    public Message.Memento next() {
        if (!hasNext())
            throw new NoSuchElementException();

        curSubIndex += 1;
        return history.get(indexes[curSubIndex]);
    }

}
