package Soal3;

public class Main {
    public static void main(String[] args) {
        // Create a Customer and Admin instance
        Customer cust = new Customer(234, "1234", "Alka", 20, "rohmanalka06@.com", "jpg");
        //Login salah
        System.out.println("========================================");
        if(cust.log_in(24, "123")) {
            //ekstensi benar
            cust.apply_verification("image.jpg");
            //ekstensi salah hanya bisa .jpg, .pdf, .png
            cust.apply_verification("document.txt");
            cust.log_out();
        }
        cust.recover_password();
        System.out.println("========================================");
        if(cust.log_in(234, "1234")) {
            //ekstensi benar
            cust.apply_verification("image.jpg");
            //ekstensi salah hanya bisa .jpg, .pdf, .png
            cust.apply_verification("document.txt");
            cust.log_out();
        }
        System.out.println("========================================");

        Admin admin = new Admin(235, "23417", "Malik", 20, "malikadz@gmail.com", "png");
        if(admin.log_in(235, "23417")) {
            admin.add_vehicle("suv");
            admin.update_vehicle_details(23);
            admin.verify_user(234);   
            admin.retrieve_complains();
            admin.log_out();
        }
        System.out.println("========================================");
    } 
}
