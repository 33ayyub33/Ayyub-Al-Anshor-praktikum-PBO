/*
Nama    : Ayyub Al Anshor
File    : KontrolSenjata.java
LAB     : C2
 */
package latihanMedium;
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        return (senjata.getPeluru() > 0);
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        int tembakanBerhasil = 0;
        if (!isAdaPeluru()){
            System.out.println("Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                    tembakanBerhasil++;
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                    break;
                }
            }
            if (tembakanBerhasil < jumlah) {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb!";
        } else{
            return "Gagal, belum pasang bayonet";
        }
    }

    public void sisaPeluru(){
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

}

