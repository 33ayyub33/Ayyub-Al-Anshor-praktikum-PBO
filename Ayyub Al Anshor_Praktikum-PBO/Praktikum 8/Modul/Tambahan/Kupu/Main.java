package Kupu;

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
        Kupu kupu = K;
        anu.setIsi(kupu);
        anu.getIsi().gerak();
    }
}