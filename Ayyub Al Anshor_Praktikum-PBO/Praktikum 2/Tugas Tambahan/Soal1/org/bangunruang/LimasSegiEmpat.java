package org.bangunruang;
import org.bangundatar.BujurSangkar;

public class LimasSegiEmpat {
    private BujurSangkar alas;
    private double tinggi;

    public LimasSegiEmpat(double sisi, double tinggi) {
        this.alas = new BujurSangkar(sisi);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return (alas.hitungLuas() * tinggi) / 3;
    }
}
