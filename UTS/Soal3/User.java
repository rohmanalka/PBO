package Soal3;

public class User extends UserProfile {
    public User(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public boolean log_in(int user_id, String password) {
        if (get_User_id() == user_id) {
            System.out.println("Welcome, " + get_name() + "!");
            return true;
        } else {
            System.out.println("Invalid credentials.");
            return false;
        }
    }

    public void recover_password() {
        System.out.println("Recovery password dilakukan");
    }

    public void log_out() {
        System.out.println(get_name() + " has logged out.");
    }
}
