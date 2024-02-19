
import java.util.Scanner;

public class method{
    
    public static void selamlama(){
        
        System.out.println("Selamlar. Hoşgeldiniz...");
    }
    
    public static void faktoriyel(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        int fak = 1;
        
        while (sayi>0){
            fak *= sayi;
            sayi--;
        }
        System.out.println("Faktöriyeli : " + fak);    
    }

    public static void main(String[] args){
        
        selamlama();
        faktoriyel();
        selamlama();
        
    
    
    
    
    
    }












}