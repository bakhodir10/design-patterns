package iterator;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Messi");
        User user2 = new User("Pique");
        User user3 = new User("Coutinho");
        List<User> users = Arrays.asList(user1, user2, user3);

        IUserAggregate uc = new UserAggregate(users);

        IIterator<User> si = uc.getUserSimplyIterator();
        IIterator<User> ri = uc.getUserRevIterator();

        while (si.hasNext()) {
            User u = si.next();
            System.out.println(u.getName());
        }

        System.out.println("***********************");

        while (ri.hasNext()) {
            User u = ri.next();
            System.out.println(u.getName());
        }

        System.out.println("**************************");
    }
}
