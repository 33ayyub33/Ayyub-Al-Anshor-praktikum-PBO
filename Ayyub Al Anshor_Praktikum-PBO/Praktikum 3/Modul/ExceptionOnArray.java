/*
File        : ExceptionOnArray.java
Deskripsi   : Program penggunaan eksepsi menggunakan class library java
Nama        : Ayyub Al Anshor
Lab         : C2
*/
public class ExceptionOnArray {
    public static void main (String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // Index ke 4 ingin dimasukin angka 10, sedangkan arraynya hanya dibuat 4 aja (0,1,2,3)
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally {
            System.out.println("clean up code...");
        }
    }
}
