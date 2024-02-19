
import java.io.PrintStream;
import java.util.Scanner;

class SiyasiException extends Exception{

    @Override
    public void printStackTrace() {
        
        System.out.println("Siyasi yasağınız bulunuyor..");
    }
}

class VizeException extends Exception{

    @Override
    public void printStackTrace(PrintStream s) {
        System.out.println("Gideceğiniz ülkeye vizeniz bulunmuyor..");   
    }

    
}
class HarcException extends Exception{

    @Override
    public void printStackTrace(PrintStream s) {
        System.out.println("Lütfen harç bedelini tam yatırın...");
    }

    
}


public class Yolcu {
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatırdığınız harç bedeli: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Siyasi yasağınız bulunuyor mu? (evet ya da hayır)");
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
            }
        else{
            this.siyasiYasak = false;
        }
        
        System.out.println("Vizeniz bulunuyor mu? (evet ya da hayır)");
        String cevap2 = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            this.vizeDurumu = true;
        }else{
        
           this.vizeDurumu = false;
        }
        
    }

    
    public void yurtdisi_harciKontrol() throws HarcException {
        
        if (this.harc < 15) {
            throw new HarcException();
            
        }else{
            System.out.println("Harç işlemi tamam");
            
        }
    }

    
    public void siyasiYasakKontrol() throws SiyasiException {
        if (this.siyasiYasak==true) {
            
            throw new SiyasiException();
            
            
        }else{
            System.out.println("Siyasi yasağınız bulunmuyor.");
            
        }
    }

    
    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu == true) {
            
            System.out.println("Vize işleminiz tamam!");
            
            
            
        }
        else{
            throw new VizeException();
            
        }
    }
    
}
