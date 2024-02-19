
package com.batuhanvural.thread3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        /*Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");
                
                for (int i = 1; i <= 10; i++) {
                    try {
                        System.out.println("Yazıyor: "+i);
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        System.out.println("Kesintiye Uğradı");
                    }
                    
                }
            }
        });*/
        
        //printer1.start();
        
        new Thread(new Runnable() {     //Bu işlem tek sefer çalıştırmak için
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");
                
                for (int i = 1; i <= 10; i++) {
                    try {
                        System.out.println("Yazıyor: "+i);
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        System.out.println("Kesintiye Uğradı");
                    }
                    
                }
            }
        }).start();
        
        
        
        System.out.println("Main Thread Çalışıyor...");
    }
    
}
