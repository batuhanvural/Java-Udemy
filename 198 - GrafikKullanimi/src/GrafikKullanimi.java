
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanimi extends JPanel{

   
    
    public GrafikKullanimi() {
        
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        g.setColor(Color.red);        
        
        g.drawRect(100, 10, 30, 40); // içi boş dikdörtgen     
        g.fillRect(200, 100, 30, 40); // içi dolu dikdörtgen
        
        g.setColor(Color.blue);
        g.drawOval(200, 200, 50, 50); //içi boş daire
        g.fillOval(300, 300, 40, 40); // içi dolu daire
        
        g.setColor(Color.yellow);
        g.drawLine(100, 100, 300, 300); //doğru parçası
        
        
    }

    
    
    
    
}
