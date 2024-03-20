/*
MLingkaran.java 20/3/2024
Penulis     : Ayyub Al Anshor
Deskripsi   : implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args){
        //Lingkaran l = new Lingkaran(10.2);
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari jari lingkaran: ");
        double jariJari = scan.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jariJari);

        System.out.println("Luas Lingkaran dengan jari jari "+jariJari + " satuan adalah " +lingkaran.hitungLuas());


        //System.out.println("Luas Lingkaran denga"+ "Jejari 10.2 satuan adalah "+l.hitungLuas());
    }
}
