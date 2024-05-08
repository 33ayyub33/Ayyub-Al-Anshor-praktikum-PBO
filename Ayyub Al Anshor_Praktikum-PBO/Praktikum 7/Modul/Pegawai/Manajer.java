public class Manajer extends Pegawai{
    int tunjangan=700000;

    public Manajer(String nama){
        this.nama=nama;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama :"+this.nama+", Gaji pokok: "+this.gajiPokok+", Tunjangan: "+this.tunjangan);
    }
}