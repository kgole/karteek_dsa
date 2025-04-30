import java.util.ArrayList;
import java.util.List;

public class UserCatalog {
    private List<User> users;

    public UserCatalog() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (user == null) {
            System.out.println("Cannot add null user.");
            return;
        }
        if (findUserByUsername(user.getUsername()) != null) {
            System.out.println("User '" + user.getUsername() + "' already exists.");
            return;
        }
        users.add(user);
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }

    public void listAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
            return;
        }
        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println("- " + user.getUsername());
        }
    }
}
