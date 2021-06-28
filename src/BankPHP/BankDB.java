package BankPHP;

import java.beans.Customizer;
import java.util.ArrayList;

public class BankDB {
    private ArrayList<User> users;

    public BankDB() {
        this.users = new ArrayList<>();
    }

    public void addUser(User userToAdd){
        for (User user: users) {
            if(user.getEmailAddress().equals(userToAdd.getEmailAddress())){
                System.out.println("User already exist");
            }
            users.add(user);
        }
    }

    public void updateUser(User user){

    }

    public void deleteUser(User user){

    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
