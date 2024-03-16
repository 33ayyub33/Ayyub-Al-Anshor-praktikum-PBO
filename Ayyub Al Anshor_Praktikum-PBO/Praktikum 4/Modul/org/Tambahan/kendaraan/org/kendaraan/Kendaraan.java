/*
File    : MKendaraan.java
Nama    : Ayyub Al Anshor
NIM     : 24060122130054
LAB     : C2
 */
package kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;

    public Kendaraan(String nama) {
        this.nama = nama;
        this.kecepatan = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan= kecepatan;
    }
    public void cetakInfo() {
        System.out.println("Nama: " + nama + ", Jenis: Kendaraan, Kecepatan: " + kecepatan);
    }

    public void gas(int kecepatan, int durasi) {
        this.kecepatan += kecepatan;
        System.out.println("Kecepatan bertambah menjadi: " + this.kecepatan);
    }

    public void berhenti() {
        this.kecepatan = 0;
        System.out.println("Kendaraan berhenti.");
    }

    public void klakson() {
        System.out.println(nama + " berbunyi.");
    }
}
