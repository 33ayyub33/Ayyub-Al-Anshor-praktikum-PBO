/*
File    : MKendaraan.java
Nama    : Ayyub Al Anshor
NIM     : 24060122130054
LAB     : C2
 */
package motor;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    private int cc;

    public Motor(String nama, int cc) {
        super(nama);
        this.cc = cc;
    }

    public int getCc(){
        return cc;
    }

    public void setCc(int cc){
        this.cc = cc;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas Mesin CC: " + cc);
    }

    public double hitungHorsepower(int angka) {
        return (double) cc / angka;
    }

    @Override
    public void klakson() {
        System.out.println(super.nama + " berbunyi, Womp Womp!");
    }
}
