/**
 * File         : MapTest.java
 * Deskripsi    :
 */
import java.util.*;
public class MapTest {
    public static void main(String[] args){
        //kunci->integer, nilai->string
        Map<Integer,String> map =new HashMap<Integer,String>();
        //menempatkan elemen kunci dan nilai
        map.put(1, "Budi");
        map.put(2, "dan");
        map.put(3, "Siti");
        map.put(4, "Sayang Ibu");
        //mengambil elemen pertama
        System.out.println(map.get(4));
        //mengambil keseluruhan kunci sebagai obek collection Set
        Set<Integer> key = map.keySet();
        //set tidak boleh ada duplikasi data
        //bagaimana iterasi untuk mengambil keseluruhan
        //nilai dari kunci ? tulis pada laporan anda!
        //petunjuk : gunakan iterasi seperti program ArrayListTest
        for(Integer v :key){
            System.out.print(map.get(v) + " ");
        }
    }
}
