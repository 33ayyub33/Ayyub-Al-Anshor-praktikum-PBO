//NAMA  : Ayyub Al Anshor
//NIM   : 24060122130054
//LAB   : C2
package org.walimahasiswa;

public class walimahasiswa {
    //Atribut
    private String nomorHP;
    private String alamat;

    // Constructor
    public walimahasiswa(String nomorHP, String alamat) {
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    // Getter dan setter untuk atribut nomorHP
    public String getnomorHP() {
        return nomorHP;
    }

    public void setnomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    // Getter dan setter untuk atribut alamat
    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return  nomorHP + ", " + alamat;
    }
}

