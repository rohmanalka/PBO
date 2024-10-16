package Soal3;

public class Admin extends User {
    public Admin(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Vehicle details diupdate dengan Vehicle ID: " + vehicle_id);
    }

    public void add_vehicle(String vehicle) {
        System.out.println("New vehicle added: " + vehicle);
    }

    public void retrieve_complains() {
        System.out.println("Complain diterima");
    }

    public void verify_user(int user_id) {
        System.out.println("User dengan ID " + user_id + " terverifikasi.");
    }
}
