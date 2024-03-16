/*
File    : MKendaraan.java
Nama    : Ayyub Al Anshor
NIM     : 24060122130054
LAB     : C2
 */

package main;

import kendaraan.Kendaraan;
import mobil.Mobil;
import motor.Motor;
import truk.Truk;

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Nathan");
        Mobil mobil = new Mobil("Bugatti Chiron", 2);
        Motor motor = new Motor("Ducati Panigale V4 R", 998);
        Truk truk = new Truk("Mercedes-Benz Actros", 20);

        kendaraan.cetakInfo();
        kendaraan.gas(30,5);
        kendaraan.cetakInfo();
        mobil.cetakInfo();
        motor.cetakInfo();
        truk.cetakInfo();
        System.out.println("");

        kendaraan.klakson();
        mobil.klakson();
        motor.klakson();
        truk.klakson();

        double hp1 = motor.hitungHorsepower(15);
        double hp2 = motor.hitungHorsepower(16);
        double hp3 = motor.hitungHorsepower(17);

        System.out.println(motor.getNama() + " diperkirakan memiliki tenaga antara " + hp3 + " sampai " + hp1 + " HP");
        System.out.println(motor.getNama() + " diperkirakan memiliki tenaga " + hp2 + " HP dengan " + hp3 + " sebagai batas bawah dan " + hp1 + " sebagai batas atas interval");
    }
}
