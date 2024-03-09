/*
Nama                : Ayyub Al Anshor
NIM                 : 24060122130054
LAB                 : C2
File                : Main.java
Deskripsi singkat   : main untuk pengujian eksepsi
 */
public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Anggota anggota = new Anggota("Boruto");
        Buku buku1 = new Buku("Matematika");
        Buku buku2 = new Buku("100 Pantun 4 Karat");
        Buku buku3 = new Buku("Belajar Koding no Root, 10 Menit Jago");
        Buku buku4 = new Buku("Jiwa Bar Barku Berkorbar!!!");
        // Buat implementasi try-catch untuk handling exception pada saat melakukan peminjaman buku
        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);// Mencoba meminjam buku ke-4
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Perhatikan Maksimal Peminjaman Buku");
        // Buat dua block catch: ketika anggota sudah meminjam buku lebih dari 3 dan ketika buku tidak tersedia/sudah dipinjam
    }
}
