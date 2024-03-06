/*
File        : AngkaSialException.java
Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
Nama        : Ayyub Al Anshor
Lab         : C2
*/
public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial !!! #hanya mitos");
    }
}
