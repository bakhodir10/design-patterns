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

        UserCollection uc = new UserCollection(users);

        Iterator<User> si = uc.getUserSimplyIterator();
        Iterator<User> ri = uc.getUserRevIterator();

        while (si.hasNext()) {
            User u = si.next();
            System.out.println(u.getName());
        }

        System.out.println("***********************");

        while (ri.hasNext()) {
            User u = ri.next();
            System.out.println(u.getName());
        }
    }
}
