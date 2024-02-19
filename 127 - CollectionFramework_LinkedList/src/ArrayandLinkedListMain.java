
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayandLinkedListMain {
    
    public static void main(String[] args) {
    
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        
        zamanhesapla("Linkedlist", linkedlist);
        zamanhesapla("ArrayList", arraylist);
        
    }
    
    public static void zamanhesapla(String veri_tipi,List<Integer> list){
    
        // Listin sonuna değer ekleme
        long baslangic;
        long bitis;
        
        baslangic = System.currentTimeMillis();
        for(int i = 0; i<100000; i++){
        
            list.add(0,i); //bu durumda arraylist yavaş linked çok hızlı. arrayın yavaş olma sebebi aşağı doğru kaydırması
        }
        bitis = System.currentTimeMillis();
        
        System.out.println(veri_tipi+" ekleme süresi "+(bitis-baslangic)+"ms");
        
    }
    
}
