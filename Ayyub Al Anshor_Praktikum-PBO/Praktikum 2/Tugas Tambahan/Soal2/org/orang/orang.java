//NAMA  : Ayyub Al Anshor
//NIM   : 24060122130054
//LAB   : C2
package org.orang;

public class orang {
    //Atribut
    private String nama;
    private String nik;

    // Constructor
    public orang(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    // Getter dan setter untuk atribut nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk atribut NIK
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return nama + ", " + nik;
    }
}
