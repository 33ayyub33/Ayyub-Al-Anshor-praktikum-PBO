/*
File    : MKendaraan.java
Nama    : Ayyub Al Anshor
NIM     : 24060122130054
LAB     : C2
 */
package mobil;
import kendaraan.Kendaraan;
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama, int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu(){
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public void bukaPintu(int nomorPintu) {
        System.out.println("Pintu nomor " + nomorPintu + " terbuka.");
    }

    @Override
    public void klakson() {
        System.out.println(super.nama + " berbunyi, Vroom Vroom!");
    }
}
