/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WDisplay;

import java.sql.ResultSet;

/**
 *
 * @author abdillah
 */
public class Pasien {

    private String Nama,Poli,JK,Alamat,Keluhan;
    private int NoUrut, NIK, Umur;
    
    public Pasien(){
        
    }

    public int NoUrut(){
        return NoUrut;
    }
    public String getNama() {
        return Nama;
    }

    public String getPoli() {
        return Poli;
    }

    public String getJK() {
        return JK;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getKeluhan() {
        return Keluhan;
    }

    public int getNIK() {
        return NIK;
    }

    public int getUmur() {
        return Umur;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setPoli(String Poli) {
        this.Poli = Poli;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setKeluhan(String Keluhan) {
        this.Keluhan = Keluhan;
    }

    public void setNIK(int NIK) {
        this.NIK = NIK;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }
    
    
    
    public void saveData(){
        Database db = new Database();
        String s;
        s = "insert into pasien values ('"+this.NoUrut+"','"+this.Poli+"','"+this.NIK+"','"+this.JK+"','"+this.Nama+"','"+this.Alamat+"','"+this.Keluhan+"','"+this.Umur+"')";
        db.query(s);
        }
        public ResultSet getData(){
        ResultSet result = null;
        Database db= new Database();
        String s;
        s = "insert into pasien values ('"+this.NoUrut+"','"+this.Poli+"','"+this.NIK+"','"+this.JK+"','"+this.Nama+"','"+this.Alamat+"','"+this.Keluhan+"','"+this.Umur+"')";
        db.query(s);
        return result;
        }    
}
