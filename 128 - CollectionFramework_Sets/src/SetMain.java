
// Özet olarak sıralı değerler ekleyeceksek TreeSet daha hızlı.
// Karışık değerler ekleyeceksek HashSet daha hızlı
// LinkedHashSet her zaman bu ikisinin arasında bir değer ortaya çıkarır.



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetMain {
    public static void main(String[] args) {
        
        //Set<String> s;
        //HashSet<String> h;
        
        /*Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();
        
        //Hashset
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("Php");
        set1.add("Javascript");
        //LinkedHashset
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("Php");
        set2.add("Javascript");
        //Treeset
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("Php");
        set3.add("Javascript");
        set3.add("Php");*/
        // !! Eğer aynı şey tekrardan yazılıyorsa onu hiçbiri basmıyor, çakışma yaşanmıyor.

        
        /*System.out.println("HashSet--------------------");
        for(String s: set1){
            System.out.println(s); //random bir sıra ile baskı yapıyor
        }
        System.out.println("LinkedHashSet--------------------");
        for(String s: set2){
            System.out.println(s);  // ekleme sıramıza göre baskı yapıyor
        }
        System.out.println("TreeSet--------------------");
        for(String s: set3){
            System.out.println(s); //alfabetik olarak depo yaptığı için alfabetik olarak bastırmış.
        }*/
         
        //System.out.println(set1.contains("Go"));  //contains() yapısı parantez içine belirttiğimiz şeyin set1'in içinde olup olmadığını sorguluyor. False true olarak dönüş alıyor.
        //System.out.println(set1.contains("Java"));
        
        //System.out.println(set1.isEmpty()); //isEmpty set1'in içi dolu mu boş mu ona bakıyor.
        
        //set1.remove("Java");  //remove içine belirttiğimiz şeyi koddan silmeyi sağlıyor.
        
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        
        set1.add("Java");
        set1.add("C++");
        set1.add("Php");
        set1.add("Python");
        set1.add("Javascript");
        
        set2.add("Go");
        set2.add("Java");
        set2.add("CSS");
        
        /*
        Set<String> fark = new HashSet<String>(set2);  //fark'ın içerisinde go,java,css var. 
        
        System.out.println(fark.removeAll(set1));  // fark kümesinin set1'e göre farklılığı var mı onu tespit ediyoruz. 
                                                  //Aynı olanları siliyor ve başka yoksa false döndürüyor. 
                                                  //farklı olanlar varsa eğer onlar kalıyor. ve true döndürüyor.
        System.out.println(fark);
        */
        
        Set<String> kesisim = new HashSet<String>(set2); //kesisim içine set2'yi aldı.
        System.out.println(kesisim.retainAll(set1));     //set 1 ile kesisim'i kıyaslayıp ortak olan var mı diye 
                                                         //kontrol sağladı. Varda true yoksa false döndü.
                                                         //ortak olmayanları sildi.
        System.out.println(kesisim);
        
        
      
        
        
        
        
    }
}
