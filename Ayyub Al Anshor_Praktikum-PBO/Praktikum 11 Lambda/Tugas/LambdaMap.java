/**
 * File : LambdaMap.java
 * Nama : Ayyub Al Anshor
 * Lab : C2
 *
 */

import java.util.HashMap;
import java.util.Map;

/*
File : LambdaMap.java
Deskripsi : Implementasi lambda pada Map, digunakan untuk menampilkan key dan value
*/
public class LambdaMap {
    public static void main(String[] args){
        // Membuat Map dengan key NIM dan value nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122120089", "Bronya");
        mahasiswaMap.put("24060122130029", "Jing Yuan");
        mahasiswaMap.put("24060122140075", "Topaz");
        mahasiswaMap.put("24060122130021", "Firefly");
        mahasiswaMap.put("24060122130020", "Trailblazer");
        mahasiswaMap.put("24060122130041", "Dan Heng");
        mahasiswaMap.put("24060122120001", "Himeko");

        // lambda digunakan untuk iterasi melalui elemen-elemen Map
        System.out.println("Lambda");
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
        System.out.println(" ");
        //lambda block statement
        System.out.println("Lambda block statement");
        mahasiswaMap.forEach((nim,nama)->{
            System.out.println("NIM " + nim + ", Nama: "+ nama);
        });
    }
}
