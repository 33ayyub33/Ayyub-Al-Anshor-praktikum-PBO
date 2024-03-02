package org.bangunruang;
import org.bangundatar.SegiEmpat;

public class LimasSegiEmpat {
    private SegiEmpat alas;
    private double tinggi;

    public LimasSegiEmpat(double sisi, double tinggi) {
        this.alas = new SegiEmpat(sisi);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return (alas.hitungLuas() * tinggi) / 3;
    }
}
