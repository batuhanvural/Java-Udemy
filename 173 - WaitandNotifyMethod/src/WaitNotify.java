// wait yapıldıysa notify'da yapılmak zorunlu !!!

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WaitNotify {
    
    public void thread1Fonksiyonu(){
    
        synchronized (this) {
         
            System.out.println("Thread1 çalışıyor...");
            System.out.println("Thread1 Thread2'nin kendisini uyandırmasını bekliyor...");
            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Thread1 uyandı. Devam ediyor.");
            
            
        }
    }
    
    public void thread2Fonksiyonu(){
        
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        synchronized (this) {
            System.out.println("Thread2 çalışıyor...");
            System.out.println("Devam etmek için bir tuşa basın...");
            
            scanner.nextLine();
            
            notify();
            System.out.println("Uyandırıldı, o gidiyor.");
        }
    
    
    
    }
    
}
