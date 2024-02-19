
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        
        
        /*for(int i = 0;i<10;i++){
        
            arraylist2.add(Integer.valueOf(i*4)); // Autoboxing
        }
        for(int i = 0; i<arraylist2.size();i++){
        
            System.out.println(arraylist2.get(i).intValue()); //Unboxing
        }*/
        
        for(int i = 0;i<10;i++){
        
            arraylist2.add(i*4); // Java kendi içinde Autoboxing yani Integer.valueOf(i*4) yapıyor
        }
        for(int i = 0; i<arraylist2.size();i++){
        
            System.out.println(arraylist2.get(i)); // Unboxing arraylist2.get(i).intValue() kendisi yapıyor 
        }
        
        
    }
}
