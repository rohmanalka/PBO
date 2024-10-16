package Soal3;

public class Customer extends User {
    public Customer(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    private boolean verification_status = false;

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String document) {
        if (document.endsWith(".jpg") || document.endsWith(".png") || document.endsWith(".pdf")) {
            System.out.println("Dokumen terverifikasi.");
        } else {
            System.out.println("Format dokumen salah hanya bisa .jpg, .png, .pdf.");
        }
    }
}
