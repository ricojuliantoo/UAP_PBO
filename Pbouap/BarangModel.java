package Pbouap;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BarangModel {
     private final Connection CONN;

    public BarangModel() {
        this.CONN = DBHelper.getConnection();
    }
    public void addBarang(Barang brg){
        String insert ="INSERT INTO barang(barcode, expired,nama_produk,harga,jumlah,diskon,kategori) VALUES ('"+brg.getBarcode()+"', '"+ brg.getExpired() + "','"+brg.getNama_produk()+"'," + brg.getHarga()+"," + brg.getJumlah()+"," + brg.getDiskon()+",'" + brg.getKtg()+"'"
                + ")";
        System.out.println(insert);
        try {
            if(CONN.createStatement().executeUpdate(insert)>0){
                System.out.println("berhasil memasukkan data"); 
            }else{
                System.out.println("Gagal memasukkan data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan data");
        }
    }
    
    public void updateBarang(Barang brg){
        String update = "UPDATE mhs SET barcode = '" + brg.getBarcode() + "', nama = '" + brg.getNama_produk() + "' WHERE barcode = '";
        
        try { 
            if (CONN.createStatement().executeUpdate(update) > 0) {
                System.out.println("Berhasil Mengupdate Data");
            } else {
                System.out.println("Gagal Mengupdate Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Mengupdate Data ");
        }
    }
    
    public void deleteBarang(String bcd){
        String insert ="DELETE FROM barang WHERE barcode='"+bcd+"'";
        try {
            if(CONN.createStatement().executeUpdate(insert)>0){
                System.out.println("berhasil menghapus data"); 
            }else{
                System.out.println("Gagal menghapus data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus data");
        }
    }
    
}
