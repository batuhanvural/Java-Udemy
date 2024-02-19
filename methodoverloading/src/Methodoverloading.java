
public class Methodoverloading {
    
    public static void skorhesapla(String isim, int puan){
        
        System.out.println(isim + " isimli oyuncunun " + puan + " puanı var.");        
    }

    public static void skorhesapla(String isim){
        
        System.out.println(isim + " isimli oyuncunun hiç puanı yok.");
    }
    
    public static void skorhesapla(int puan){
    
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var.");
    }

    public static void main(String[] args) {
        
        skorhesapla("Batu", 1200);
        skorhesapla("Batuhan");
        skorhesapla(30000);    
    }
}