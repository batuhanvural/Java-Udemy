
// İç içe fonksiyonlarda kullanılır. Stacklerden çıkmadan hatayı göstermemiz gerekiyor.


public class Main {
    
    public static void ucuncufonksiyon(){
        System.out.println("Üçüncü fonk");
        try {
            int a = 12 / 0;
            
        } catch (Exception e) {
            System.out.println("Bir sayı 0'a bölünemez.");
        }
        
    }
    
    public static void ikincifonksiyon(){
    
        ucuncufonksiyon();
        System.out.println("İkinci fonk");
    }
    public static void birincifonksiyon(){
    
        ikincifonksiyon();
        System.out.println("Birinci fonk");
    }
    
    
    public static void main(String[] args) {
        
        birincifonksiyon();
        
        
        
        
    }
}
