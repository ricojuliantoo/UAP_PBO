package Pbouap;
import db.DBHelper;

public class Pbouap {

    public static void main(String[] args) {
        Makanan mkn = new Makanan(70, "Bakso", 15000, 1, 2000, 1000);
        MakananModel mm = new MakananModel();
        mm.addMakanan(mkn);
        mm.deleteMakanan("70");
    }
//        Barang brg = new Barang("70", "2022","Bakso", 15000, 1, 2000,1000);
//        BarangModel bm = new BarangModel();
//        bm.addBarang(brg);
    }
    

