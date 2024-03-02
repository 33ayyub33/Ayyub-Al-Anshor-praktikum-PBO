//NAMA  : Ayyub Al Anshor
//NIM   : 24060122130054
//LAB   : C2
package org.main;
import org.mahasiswa.*;
import org.orang.*;
import org.walimahasiswa.*;
public class main {
    public static void main(String[] args) {

        orang orang1 = new orang("Anshor", "332819020506003");
        walimahasiswa Jono = new walimahasiswa("082993213995512", "Jl. Kebon Jeruk");

        mahasiswa Naruto = new mahasiswa("240901245821", "INFORMATIKA", Jono);
        //Nampilin informasi orang
        System.out.println("Data orang1: " + "("+ orang1 +")");
        //Nampilin informasi walimahasiswa
        System.out.println("Data wali Jono: " + "("+ Jono +")");
        //Nampilin Mahasiswa
        System.out.println("Data mahasiswa Naruto : " + "("+ Naruto +")");

        //Mencoba set
        orang1.setNama("Syakura");
        orang1.setNik("3328190205023214");

        //Mencoba get
        walimahasiswa wali2 = new walimahasiswa("093232392323", "Jl. Pekuncen No 2");
        wali2.getnomorHP();
        wali2.getalamat();
        //Menampilkan kembali
        System.out.println("Data orang1 yang telah diupdate: " + "("+ orang1 +")");

        //Menampilkan wali2 dengan menggunakan get
        System.out.println("Menampilkan data walimahasiswa (wali2) dengan menggunakan get");
        System.out.println("Data wali2: " + "("+ wali2.getnomorHP() + ", " + wali2.getalamat() +")");


    }
}
