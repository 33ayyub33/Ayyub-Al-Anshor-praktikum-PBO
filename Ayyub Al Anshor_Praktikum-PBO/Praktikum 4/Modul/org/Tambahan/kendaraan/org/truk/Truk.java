/*
File    : MKendaraan.java
Nama    : Ayyub Al Anshor
NIM     : 24060122130054
LAB     : C2
 */
package truk;

import kendaraan.Kendaraan;

public class Truk extends Kendaraan {
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk(String nama, int kapasitasMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
        this.beratMuatan = 0;
    }

    public int getKapasitasMuatan(){
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan){
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getBeratMuatan(){
        return beratMuatan;
    }

    public void setBeratMuatan(int beratMuatan){
        this.beratMuatan = beratMuatan;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan + ", Berat Muatan: " + beratMuatan);
    }

    public void muatBarang(int berat) {
        if (beratMuatan + berat <= kapasitasMuatan) {
            beratMuatan += berat;
            System.out.println("Berat muatan bertambah menjadi: " + beratMuatan);
        } else {
            System.out.println("Muatan melebihi kapasitas truk!");
        }
    }

    @Override
    public void klakson() {
        System.out.println(super.nama + " berbunyi, Honk Honk!");
    }
}
