//Finally bloğu her durumda çalışır. Mutalaka yapılması gereken işlemler için kullanılıyor. Yani öncesinde hata olsa bile çalışır.


public class Main {
    public static void main(String[] args) {
        
        
        try {
            
            String s = "Mustafa";
            
            System.out.println(s.hashCode());
            
        } catch (NullPointerException e) {
            System.out.println("Null Referans Hatası..");
        }
        
        finally{
        
            System.out.println("Finally Bloğu çalışıyor.");
        }
        
    }
    
}
