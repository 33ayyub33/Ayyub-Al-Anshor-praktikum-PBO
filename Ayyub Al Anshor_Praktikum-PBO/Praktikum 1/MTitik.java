/**
* File		:MTitik.java 21/2/2024
* Nama Penulis	:Ayyub Al Anshor
* NIM		:24060122130054
* Deskripsi	:Main dari Titik
* Tanggal	:Rabu, 21 Februari 2024
*/
class MTitik
{
		public static void main(String[] args)
		{
			Titik t1, t2, t3;
			
			t1 = new Titik();
			t1.setAbsis(1);
			t1.setOrdinat(2);
			
			t2 = new Titik();
			t2.setAbsis(3);
			t2.setOrdinat(4);
			
			t3 = new Titik(5,6);
/*			System.out.println("Absis T1 = " + t1.getAbsis());
			System.out.println("Ordinat T1 = " + t1.getOrdinat());

			System.out.println("Absis T2 = " + t2.getAbsis());
			System.out.println("Ordinat T2 = " + t2.getOrdinat());

			System.out.println("Absis T3 = " + t3.getAbsis());
			System.out.println("Ordinat T3 = " + t3.getOrdinat());
*/

			System.out.println("Jumlah Objek Titik : " + Titik.getCounter());
			System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
			System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
			System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
		}
}
