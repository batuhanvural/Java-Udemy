
import java.util.HashMap;
import java.util.Map;

/*
    HashMap Sınıfı

- Değerleri Key ve Value olarak depolar. Her Key'e karşılık gelen bir tane değer bulunur.
- Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
- Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz.
*/


public class HashMapMain {
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();   //HashMap<K,V> = HashMap<Integer,String>
                                                                           //K = Key V = Value
        
        hashMap.put(10, "Java");
        hashMap.put(30, "Python");        
        hashMap.put(50, "Php");      //Keyler farklı olduğu için alttakiyle çakışmıyor ve çalışıyor.  
        hashMap.put(20, "Php");
        hashMap.put(20, "Php");     //Üstteki ile keyleri ortak olduğu için yazılmıyor.
        
        hashMap.put(50, "Javascript");//bu key daha önce herhangi bir şeye verilmiş bile olsa en son neye yazarsam o çalışır
        
        
        /*System.out.println(hashMap);
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(100)); //Key'in eşiti olmadığı için null döner. Hata vermez.*/
        
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
        
            System.out.println("Anahtar: "+entry.getKey()+" ----> Değer: "+entry.getValue());
        }
        
        
    }
    
}
