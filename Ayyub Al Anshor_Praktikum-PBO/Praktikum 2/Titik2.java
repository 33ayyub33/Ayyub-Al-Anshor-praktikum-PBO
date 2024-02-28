public class Titik2 {
    //atribut
    private double absis;
    private double ordinat;
    static double counterTitik;
    //static int numberOfPoints;

    //konstruktor
    //membuat objek titik dengan inisialisasi nilai absis dan ordinat
    public Titik2(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //membuat objek titik dengan inisialisasi absis 0 dan ordinat 0
    public Titik2(){
        this(0,0);
    }

    //method
    //fungsi selektor untuk mendapatkan nilai atribut absis
    public double getAbsis(){
        return this.absis;
    }

    //fungsi selektor untuk mendoatkan nilai atribut ordinat
    public double getOrdinat(){
        return this.ordinat;
    }

    //prosedur untuk mengeset nilai atribut absis dengan nilai yang baru
    public void setAbsis(double absis){
        this.absis = absis;
    }
    //prcedure untuk mengeset nilai atribut ordinat dengan nilai yang baru
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    static double getCounter()
    {
        return counterTitik;
    }
    public double getJarakPusat(){
        double jarak = Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
        return jarak;
    }
    public void refleksiX(){
        this.ordinat = -this.ordinat;
    }

    public void refleksiY(){
        this.absis = -this.absis;
    }

    public Titik2 getRefleksiX(){
        Titik2 t = new Titik2(-absis, ordinat);
        return t;
    }

    public Titik2 getRefleksiY(){
        Titik2 t = new Titik2(absis, -ordinat);
        return t;
    }

}
