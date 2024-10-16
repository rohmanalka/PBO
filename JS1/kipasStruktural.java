public class kipasStruktural {
    public static void main(String[] args) {
        String merk, ukuran, merk2, ukuran2, merk3, ukuran3, merk4, ukuran4, merk5, ukuran5, 
        merk6, ukuran6, merk7, ukuran7, merk8, ukuran8, merk9, ukuran9, merk10, ukuran10;
        int kecepatan, kecepatan2, kecepatan3, kecepatan4, kecepatan5, kecepatan6,
        kecepatan7, kecepatan8, kecepatan9, kecepatan10;
        
        merk = "Maspion";
        ukuran = "kecil";
        kecepatan = 5;

        merk2 = "Cosmos";
        ukuran2 = "Kecil";
        kecepatan2 = 8;

        merk3 = "Miyako";
        ukuran3 = "Sedang";
        kecepatan3 = 10;

        merk4 = "Panasonic";
        ukuran4 = "Kecil";
        kecepatan4 = 7;

        merk5 = "Sekai";
        ukuran5 = "Sedang";
        kecepatan5 = 12;

        merk6 = "National Plus";
        ukuran6 = "Sedang";
        kecepatan6 = 15;

        merk7 = "Regency";
        ukuran7 = "Sedang";
        kecepatan7 = 14;

        merk8 = "Sanex";
        ukuran8 = "Sedang";
        kecepatan8 = 17;

        merk9 = "Sharp";
        ukuran9 = "Besar";
        kecepatan9 = 25;

        merk10 = "Midea";
        ukuran10 = "Besar";
        kecepatan10 = 20;
        
        kecepatan = tambahKecepatan (kecepatan, 5);
        kecepatan2 = tambahKecepatan (kecepatan2, 8);
        kecepatan3 = tambahKecepatan (kecepatan3, 10);
        kecepatan4 = tambahKecepatan (kecepatan4, 7);
        kecepatan5 = tambahKecepatan (kecepatan5, 12);
        kecepatan6 = tambahKecepatan (kecepatan6, 15);
        kecepatan7 = tambahKecepatan (kecepatan7, 14);
        kecepatan8 = tambahKecepatan (kecepatan8, 17);
        kecepatan9 = tambahKecepatan (kecepatan9, 25);
        kecepatan10 = tambahKecepatan(kecepatan10, 20);

        System.out.println ("Merek: " + merk);
        System.out.println("Ukuran: " + ukuran);
        System.out.println ("Kecepatan: " + kecepatan);
        System.out.println();

        System.out.println ("Merek2: " + merk2);
        System.out.println("Ukuran2: " + ukuran2);
        System.out.println ("Kecepatan2: " + kecepatan2);
        System.out.println();

        System.out.println ("Merek3: " + merk3);
        System.out.println("Ukuran3: " + ukuran3);
        System.out.println ("Kecepatan3: " + kecepatan3);
        System.out.println();

        System.out.println ("Merek4: " + merk4);
        System.out.println("Ukuran4: " + ukuran4);
        System.out.println ("Kecepatan4: " + kecepatan4);
        System.out.println();

        System.out.println ("Merek5: " + merk5);
        System.out.println("Ukuran5: " + ukuran5);
        System.out.println ("Kecepatan5: " + kecepatan5);
        System.out.println();

        System. out.println ("Merek6: " + merk6);
        System.out.println("Ukuran6: " + ukuran6);
        System. out.println ("Kecepatan6: " + kecepatan6);
        System.out.println();

        System. out.println ("Merek7: " + merk7);
        System.out.println("Ukuran7: " + ukuran7);
        System. out.println ("Kecepatan7: " + kecepatan7);
        System.out.println();

        System. out.println ("Merek8: " + merk8);
        System.out.println("Ukuran8: " + ukuran8);
        System. out.println ("Kecepatan8: " + kecepatan8);
        System.out.println();

        System. out.println ("Merek9: " + merk9);
        System.out.println("Ukuran9: " + ukuran9);
        System. out.println ("Kecepatan9: " + kecepatan9);
        System.out.println();

        System. out.println ("Merek10: " + merk10);
        System.out.println("Ukuran10: " + ukuran10);
        System. out.println ("Kecepatan10: " + kecepatan10);
        System.out.println("================================");

        kecepatan = kurangiKecepatan (kecepatan, 5);
        kecepatan2 = kurangiKecepatan (kecepatan2, 8);
        kecepatan3 = kurangiKecepatan (kecepatan3, 10);
        kecepatan4 = kurangiKecepatan (kecepatan4, 7);
        kecepatan5 = kurangiKecepatan (kecepatan5, 12);
        kecepatan6 = kurangiKecepatan (kecepatan6, 15);
        kecepatan7 = kurangiKecepatan (kecepatan7, 14);
        kecepatan8 = kurangiKecepatan (kecepatan8, 17);
        kecepatan9 = kurangiKecepatan (kecepatan9, 25);
        kecepatan10 = kurangiKecepatan(kecepatan10, 20);

        System.out.println ("Merek: " + merk);
        System.out.println("Ukuran: " + ukuran);
        System.out.println ("Kecepatan: " + kecepatan);
        System.out.println();

        System.out.println ("Merek2: " + merk2);
        System.out.println("Ukuran2: " + ukuran2);
        System.out.println ("Kecepatan2: " + kecepatan2);
        System.out.println();

        System.out.println ("Merek3: " + merk3);
        System.out.println("Ukuran3: " + ukuran3);
        System.out.println ("Kecepatan3: " + kecepatan3);
        System.out.println();

        System.out.println ("Merek4: " + merk4);
        System.out.println("Ukuran4: " + ukuran4);
        System.out.println ("Kecepatan4: " + kecepatan4);
        System.out.println();

        System.out.println ("Merek5: " + merk5);
        System.out.println("Ukuran5: " + ukuran5);
        System.out.println ("Kecepatan5: " + kecepatan5);
        System.out.println();

        System. out.println ("Merek6: " + merk6);
        System.out.println("Ukuran6: " + ukuran6);
        System. out.println ("Kecepatan6: " + kecepatan6);
        System.out.println();

        System. out.println ("Merek7: " + merk7);
        System.out.println("Ukuran7: " + ukuran7);
        System. out.println ("Kecepatan7: " + kecepatan7);
        System.out.println();

        System. out.println ("Merek8: " + merk8);
        System.out.println("Ukuran8: " + ukuran8);
        System. out.println ("Kecepatan8: " + kecepatan8);
        System.out.println();

        System. out.println ("Merek9: " + merk9);
        System.out.println("Ukuran9: " + ukuran9);
        System. out.println ("Kecepatan9: " + kecepatan9);
        System.out.println();

        System. out.println ("Merek10: " + merk10);
        System.out.println("Ukuran10: " + ukuran10);
        System. out.println ("Kecepatan10: " + kecepatan10);
        }

        public static int tambahKecepatan(int kecepatan, int increment) {
            kecepatan += increment;
            return kecepatan;
        }

        public static int kurangiKecepatan(int kecepatan, int decrement) {
            kecepatan -= decrement;
            return kecepatan;
        }
}