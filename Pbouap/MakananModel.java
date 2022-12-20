/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbouap;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MakananModel {
     private final Connection CONN;

    public MakananModel() {
        this.CONN = DBHelper.getConnection();
    }
    public void addMakanan(Makanan mkn){
        String insert ="INSERT INTO makanan(id, nama_produk, harga, jumlah, diskon, daya_tahan) VALUES ("+mkn.getId()+",'"+mkn.getNama_produk()+"', "+mkn.getHarga()+", "+mkn.getJumlah()+", "+ mkn.getDiskon()+",'" + mkn.getDaya_tahan()+"'"
                + ")";
        System.out.println(insert);
        try {
            if(CONN.createStatement().executeUpdate(insert)>0){
                System.out.println("berhasil memasukkan data"); 
            }else{
                System.out.println("Gagal memasukkan data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan data");
        }
    }
    
    public void deleteMakanan(String abc){
        String insert ="DELETE FROM makanan WHERE id='"+abc+"'";
        try {
            if(CONN.createStatement().executeUpdate(insert)>0){
                System.out.println("berhasil menghapus data"); 
            }else{
                System.out.println("Gagal menghapus data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MakananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus data");
        }
    }

    }
