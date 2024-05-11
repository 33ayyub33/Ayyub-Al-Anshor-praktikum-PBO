/**
 * Nama     : Ayyub Al Anshor
 * NIM      : 24060122130054
 */
package Kupu2;


public class Main2 {
    public static void main(String[] args) {
        Ulat2 K = new Ulat2();
        Data2<Kupu2> anu = new Data2<>();

        Kupu2 kupu = K;
        anu.setIsi(kupu);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}

