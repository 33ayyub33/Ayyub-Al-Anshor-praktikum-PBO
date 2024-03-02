//Nama  : Ayyub Al Anshor
//NIM   : 24060122130054
//LAB   : C2
public class MGaris {
    public static void main(String[] args)
    {
        Titik2 t1, t2, t3;

        t1 = new Titik2();
        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2 = new Titik2();
        t2.setAbsis(3);
        t2.setOrdinat(4);
        Garis g1= new Garis(t1,t2);

        t3 = new Titik2(5,6);
        System.out.println("Absis T1 = " + t1.getAbsis());
        System.out.println("Ordinat T1 = " + t1.getOrdinat());

        System.out.println("Absis T2 = " + t2.getAbsis());
        System.out.println("Ordinat T2 = " + t2.getOrdinat());

        System.out.println("Absis T3 = " + t3.getAbsis());
        System.out.println("Ordinat T3 = " + t3.getOrdinat());

        System.out.println("Jumlah Objek Titik : " + Titik2.getCounter());
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t1(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t1(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        //Garis
        System.out.println("Titik awal Garis : (" + g1.getTitikAwal().getAbsis()+ "," +g1.getTitikAwal().getOrdinat()+ ")");
        System.out.println("Titik akhir Garis : (" + g1.getTitikAkhir().getAbsis()+ "," +g1.getTitikAkhir().getOrdinat()+ ")");

        //Refleksi
        t1.refleksiX();
        System.out.println("Hasil dari refleksi X pada t1 adalah :" + t1.getAbsis() + "," + t1.getOrdinat());

        //Jarak Pusat
        double jarak = t1.getJarakPusat();
        System.out.println("Jarak pusat t1 adalah : " + jarak);

        //getRefleksiX
        Titik2 titikRefleksiX = t1.getRefleksiX();
        System.out.println("Titik getrefleksi X: (" + titikRefleksiX.getAbsis() + "," + titikRefleksiX.getOrdinat() + ")");

        //getRefleksiY
        Titik2 titikRefleksiY = t1.getRefleksiY();
        System.out.println("Titik getrefleksi Y: (" + titikRefleksiY.getAbsis() + "," + titikRefleksiY.getOrdinat() + ")");

        //Menampilkan panjang garis
        System.out.println("Panjang garis g1 : " + g1.getPanjang());

        //Menampilkan gradien garis
        System.out.println("Gradien garis g1 : " + g1.getGradien());

        //getRefleksiY
        Garis garisRefleksiY = g1.getRefleksiY();
        System.out.println("Garis refleksi Y:");
        System.out.println("Titik awal yaitu: (" + garisRefleksiY.getTitikAwal().getAbsis() + "," + garisRefleksiY.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir yaitu: (" + garisRefleksiY.getTitikAkhir().getAbsis() + "," + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");

        //isTegakLurus
        Garis g2 = new Garis(t1, new Titik2(2, 7));   //Membuat garis baru untuk dibandingkan
        System.out.println("Apakah garis g1 tegak lurus dengan garis g2? " + g1.isTegakLurus(g2));
    }
}
