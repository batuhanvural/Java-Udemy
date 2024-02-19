
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("dosya.txt");
            
            int deger;
            
            String s = "";
            
            int say = 0;
            fis.skip(5);
            
            while ((deger = fis.read()) != -1) {
            
                s += (char) deger;
                say++;
                
                if (say == 11) {
                    break;
                }
                
            }
            
            System.out.println("Dosyanın 5. Yerinden itibaren 10 karakter: " +s);
            
            
            /*while((deger = fis.read()) != -1){
            
                s += (char) deger;
            }
            
            System.out.println("Dosya içeriği: " +s);*/
            



            //fis.skip(5); //kaçıncı karakteri okumak istediğimizi yazdık.
           
            /* System.out.println("İlk karakter: "+(char)(fis.read()));
            System.out.println("İkinci karakter: "+(char)(fis.read()));*/
            
            
            /*System.out.println("Birinci karakter: "+(char)(fis.read())); //fis.read() tek bir byte okuyor.
            System.out.println("İkinci karakter: "+(char)(fis.read()));
            System.out.println("Üçüncü karakter: "+(char)(fis.read()));
            System.out.println("Dördüncü karakter: "+(char)(fis.read()));*/
            
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata oluştu..");
        }
        finally{
            try {
                if(fis!= null){ //NullPointerException hatasını almamak için if bloğuna aldık.
                    fis.close();
                }
                
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu.");
            }
        }
        
        
    }
    
}
