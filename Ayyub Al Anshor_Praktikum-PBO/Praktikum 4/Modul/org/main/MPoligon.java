package main;
import bangundatar.*;
/*
File        : MPoligon.java 13/03/2024
Penulis     : Ayyub Al Anshor
Deskripsi   : Driver class untuk poligon dan persegi panjang
 */
public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());
    }
}
