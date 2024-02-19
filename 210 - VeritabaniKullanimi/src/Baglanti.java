import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Baglanti {
    
    private String kullanici_adi = "root";
    private String parola = "";    
    private String db_ismi = "demo";
    private String host = "localhost";    
    private int port = 3306;    
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public void preparedCalisanlarıGetir(int id){
        
        String sorgu = "SELECT * FROM calisanlar WHERE id > ? and soyad like ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, "V%");
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) { 
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Ad Soyad: "+ad+" "+soyad+" Email: "+email);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    public void calisanEkle(){
    
        try {
            statement = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ad = "Ayşe";
        String soyad = "VURAL";
        String email = "aysevural@outlook.com";
        String sorgu = "INSERT INTO calisanlar (ad,soyad,email) VALUES("+"'"+ad+"',"+"'"+soyad+"',"+"'"+email+"')";
        try {
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void commitverollback(){ 
        //commit : yazılan bütün sorguların hepsi doğru çalışırsa çalıştır demek.
        //rollback : iptal et. sorun olursa hiçbirini çalıştırma demek.
        Scanner scanner = new Scanner(System.in);
        
        try {
        con.setAutoCommit(false); //Kontrol bizde otomatik değil demek.
        String sorgu1 = "DELETE FROM calisanlar WHERE id = 3";
        String sorgu2 = "UPDATE calisanlar SET email = 'batuhanuralll@outlook.com' WHERE id = 1";
        
            System.out.println("Güncellenmeden önce");
            calisanlariGetir();
            
            Statement statement = con.createStatement();
            statement.executeUpdate(sorgu1);
            statement.executeUpdate(sorgu2);
            
            System.out.println("İşlemleriniz kaydedilsin mi? (y or n)");
            String cevap = scanner.nextLine();
            
            if (cevap.equals("y")) {
                con.commit();
                calisanlariGetir();
                System.out.println("Veritabanı Güncellendi...");
                
            }else{
            
                con.rollback();
                System.out.println("Veritabanı Güncellenmesi İptal Edildi.");
                calisanlariGetir();
            }
            
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void calisanGuncelle(){
        
        try {
            statement = con.createStatement();
            String sorgu = "UPDATE calisanlar SET email = 'bbbatuhanvuralll@outlook.com' WHERE id = 1";
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void calisanSil(){
    
        try {
            statement = con.createStatement();
            String sorgu = "DELETE FROM calisanlar WHERE id > 2";
            int deger = statement.executeUpdate(sorgu);
            System.out.println(deger + " veri etkilendi");
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void calisanlariGetir(){
    
        String sorgu = "SELECT * FROM calisanlar";
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
            
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("ID: "+id+" Ad: "+ad+" Soyad: "+soyad+" Email: "+email);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Baglanti() {
                   //"jdbc:mysql://localhost:3306/demo"
        String url = "jdbc:mysql://"+host+":"+port+"/"+db_ismi+"?useUnicode=true&characterEncoding=UTF-8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Driver bulunamadı..");
        }
        try {
            con = DriverManager.getConnection(url,kullanici_adi,parola);
            System.out.println("Bağlantı Başarılı");
            
        } catch (Exception e) {
            System.out.println("Bağlantı Başarısız..");
        }

        
        
        
    }
   
    public static void main(String[] args) {
        
        Baglanti baglanti = new Baglanti();
        baglanti.commitverollback();
        //baglanti.preparedCalisanlarıGetir(1);
        //System.out.println("Eklenmeden Önce...");
        //baglanti.calisanlariGetir();
        //System.out.println("*****************");        
        //baglanti.calisanlariGetir();
        //baglanti.calisanSil();
        //baglanti.calisanlariGetir();
        //baglanti.calisanGuncelle();
        //baglanti.calisanlariGetir();
        //baglanti.calisanEkle();
        //baglanti.calisanlariGetir();
        
        
    }
    
}
