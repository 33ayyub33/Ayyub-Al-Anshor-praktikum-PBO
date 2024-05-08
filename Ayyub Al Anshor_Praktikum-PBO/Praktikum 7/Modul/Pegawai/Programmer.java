public class Programmer extends Pegawai{
    int bonus=450000;

    public Programmer(String nama){
        this.nama=nama;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : "+this.nama+", Gaji Pokok: "+this.gajiPokok+", Bonus: "+this.bonus);
    }
}