
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Ramazan Pidesi Uygulaması...");
        Random random = new Random();
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        
        pide_kuyrugu.offer("Ali");
        pide_kuyrugu.offer("Ahmet");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Can");
        pide_kuyrugu.offer("Mert");
        pide_kuyrugu.offer("Batuhan");
        pide_kuyrugu.offer("Nazım");
        pide_kuyrugu.offer("Buğrahan");
        pide_kuyrugu.offer("Oğuzhan");
        pide_kuyrugu.offer("Kerem");
        
        int pide_sayisi = 1 + random.nextInt(10);
        
        System.out.println("Pideler çıkıyor...");
        System.out.println("Çıkan Pide Sayısı: "+pide_sayisi);
        Thread.sleep(1000);
        
        while (pide_sayisi != 0) {
            
            System.out.println(pide_kuyrugu.poll() + " pideyi aldı...");
            pide_sayisi--;
            Thread.sleep(500);
           
        }
        System.out.println("Pide kalmadı...");
        
        
        
        
     
        
        
        
    }
}
