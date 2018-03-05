package iterator;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Messi");
        User user2 = new User("Pique");
        User user3 = new User("Coutinho");
        List<User> users = new LinkedList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        AbstractCollection<User> userCollection = new UserCollection(users);

        AbstractIterator<User> simpleIterator = userCollection.getUserRevIterator();
        AbstractIterator<User> reverseIterator = userCollection.getUserRevIterator();

        while (simpleIterator.hasNext()) {
            User u = simpleIterator.next();
            System.out.println(u.getName());
        }

        System.out.println("***********************");

        while (reverseIterator.hasNext()) {
            User u = reverseIterator.next();
            System.out.println(u.getName());
        }
    }
}
