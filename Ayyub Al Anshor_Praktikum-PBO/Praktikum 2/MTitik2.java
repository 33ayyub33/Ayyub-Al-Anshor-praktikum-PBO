class MTitik2
{
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
    }
}