/*
File        : AngkaSial.java
Deskripsi   : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
Nama        : Ayyub Al Anshor
Lab         : C2
*/
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " Bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
1. Baris 12 pada AngkaSial.java akan dieksekusi hanya jika eksepsi tidak terjadi saat metode cobaAngka dipanggil.
Namun, jika eksepsi terjadi dalam metode cobaAngka, yaitu ketika nilai angka sama dengan 13, maka baris 12 tidak akan dieksekusi karena aliran eksekusi program akan langsung beralih ke blok catch di Main.java, dan baris 12 tidak akan dieksekusi sebelumnya. Oleh karena itu, baris 12 akan dilewati jika eksepsi terjadi.
2. Baris 21 pada AngkaSial.java akan dieksekusi karena pada saat try dibaris 17, as.cobaAngka(10) tidak masalah namun saat as.cobaAngka(13) maka akan di lempar dan dicatch sama AngkaSialException karena angak 13.
Sehingga, bisa disimpulkan baris 21 akan dieksekusi.
Sehingga output :
Jangan memasukkan angka 13 karena angka sial !!! #hanya mitos
hati-hati memasukkan angka!!!

 */
