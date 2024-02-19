
import java.util.ArrayList;

public class Main {
    
    public static void yazdir(ArrayList<String> a){
    
        for(int i = 0; i< a.size();i++){
            System.out.println("Element " +(i+1)+" : "+a.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String > arraylist = new ArrayList<String>();
        
        arraylist.add("Metallica");
        arraylist.add("Gun's Roses");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Maiden");
        
        /*Çıktı Alma
        
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(2));
        System.out.println(arraylist.get(3));*/
        
        //System.out.println(arraylist.size());
        
        /*Arraylist ten kaldırmak için
        arraylist.remove("Metallica");
        arraylist.remove(1);*/
        
        /* 
        Hangi array'ın kaçıncı sırada olduğunu gösterir.
        
        System.out.println(arraylist.indexOf("Metallica"));
        System.out.println(arraylist.indexOf("Batuhan")); //olmayan bir değer -1 dönderir.        
        */
        
        
        /*
        ArrayList güncelleme
        
        arraylist.set(2,"Megadeth");
        */
        
        yazdir(arraylist);
        
    }
}