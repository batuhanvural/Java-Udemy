
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        
        //TreeMap kullanarak bir stringin içindeki harflerin frekansını bulma
        // yani bir harfin kaç defa geçtiğini bulacağız.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümleyi Giriniz...");
        String cumle = scanner.nextLine();
        Map<Character,Integer> frekans = new TreeMap<Character,Integer>();
        
        for (int i = 0; i < cumle.length(); i++) {
            
            char c = cumle.charAt(i); //cümlenin o anki karakterini temsil eder.
            
            if(frekans.containsKey(c)){ //frekans map'inde daha önce o key mevcutsa
            
                frekans.replace(c, frekans.get(c) + 1);
            }
            else{
            
                frekans.put(c, 1);
            }
            
            
        }
        
        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println("Karakter: "+entry.getKey()+" "+entry.getValue()+" kadar geçiyor...");
            
        }
        
        
        
        
        
        
        
    }
    
}
