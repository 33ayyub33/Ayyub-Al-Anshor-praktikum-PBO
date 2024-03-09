/*
Nama                : Ayyub Al Anshor
NIM                 : 24060122130054
LAB                 : C2
File                : Anggota.java
Deskripsi singkat   : class untuk pengujian eksepsi
 */
public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;
    private static final int max_pinjam = 3;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[max_pinjam];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        if (jumlahBukuPinjaman >= max_pinjam) {
            throw new MaksimumBukuTerpinjamException("Sudah mencapai batas maksimum peminjaman buku.");
        }

        String errorMessage = buku.isTersedia() ? null : "Buku tidak tersedia.";
        if (errorMessage != null) {
            throw new BukuTidakTersediaException(errorMessage);
        }

        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }

}
