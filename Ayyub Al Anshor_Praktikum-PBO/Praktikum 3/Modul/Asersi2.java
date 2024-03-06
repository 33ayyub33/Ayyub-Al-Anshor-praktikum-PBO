/*
File        : Asersi2.java
Deskripsi   : Program untuk demo asersi, yang akan menolak input jari jari lingkaran yang bernilai nol
Nama        : Ayyub Al Anshor
Lab         : C2
*/

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 7;
        //kalo terpenuhi masuk assert, klo ngga keluar dari assert
        assert (jariJari>0):"jari jari tidak boleh nol!!!"; //konsep kondisional, ekspression
        Lingkaran l = new Lingkaran (jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "
            +kelilingLingkaran);
    }
}

/*
Jawaban : Untuk inputan tidak boleh nol, karena kalo nol maka asersi akan terus gagal, solusinya inisialisasi jari jari
 */