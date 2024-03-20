/*
MBujurSangkar.java 20/3/2024
Penulis     : Ayyub Al Anshor
Deskripsi   : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */

import java.util.Scanner;
public class MBujurSangkar {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Bujursangkar bs = new Bujursangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+ " satuan adalah "+bs.hitungLuas(sisi));
    }
}

//Jika kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar, maka akan terjadi error kompilasi. Hal ini karena jika sebuah kelas mewarisi kelas abstrak yang memiliki metode abstrak, kelas tersebut harus mengimplementasikan semua metode abstrak yang ada dalam kelas abstrak tersebut.