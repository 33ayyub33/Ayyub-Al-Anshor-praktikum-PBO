/**
 * File         : BangunDatarGenericTest.java
 * Deskripsi    : main class untuk generic bangun datar
 */
public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran>bdg=
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran : " +bdg.hitungKeliling());
        System.out.println("tipe generic :" +bdg.get().getClass().getName());
        //class, variabel, method ada yang dinamakan runtime(dinamamkan sytax dijalankan, variabel disimpan)
        //Lingkaran@34c45dca = alamat memori lingkaran yang disimapan. angka itu adalah hexadesimal untuk alamat penyimpanan
    }
}
