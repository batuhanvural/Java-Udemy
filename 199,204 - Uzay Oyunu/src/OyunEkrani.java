
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkrani extends JFrame{

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        
    OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
    
    ekran.setResizable(false);
    ekran.setFocusable(false); //Bu ikisini yapma sebebimiz ekran acildiginda JFrame'e degil JPanele odaklanmasını istememizden.
    
    ekran.setSize(800,600);
    ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Oyun oyun = new Oyun();
    
    oyun.requestFocus(); //Klavye islemlerini anlamisi icin yazildi    
    oyun.addKeyListener(oyun);
    oyun.setFocusable(true);
    oyun.setFocusTraversalKeysEnabled(false); //klavye islemlerini anlamasi icin
    
    
    ekran.add(oyun);
    ekran.setVisible(true);
    
        
        
                
        
    }
    
    
}
