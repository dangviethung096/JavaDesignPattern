package hungdv39.test.proxy_pattern.modified;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModifiedProxy extends Subject {
    static Subject subject;
    String currentUser;
    List<String> registeredUsers;

    public ModifiedProxy(String currentUser) {
        registeredUsers = new ArrayList<>(Arrays.asList("Admin", "Rohit", "Sam"));
        this.currentUser = currentUser;
    }

    @Override
    public void doSomeWork() {
        System.out.println(currentUser + " wants to invoke doSomeWork");
        if (registeredUsers.contains(currentUser)) {
            if (subject == null) {
                subject = new ConcreteSubject();
            }
            // Do some work
            subject.doSomeWork();
        } else {
            System.out.println("Sorry, " + currentUser + " do not have access rights");
        }

    }
}
