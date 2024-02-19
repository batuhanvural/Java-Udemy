
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


class Player{

    @Override
    public String toString() {
        return "|||| ID: "+ id +" İsim "+ isim + "|||";
        
    }
    
    // Alt tarafta bulunan hashCode ve equals'un amacı; normal şartlarda hazır metod yani HashSet kullandığımızda onun
    // içerisinde zaten bu alanların var olmasıdır. Sağ click sonrasında Insert code'dan bu alanları oluşturuyoruz ki
    // hash codelarını oluştursun ve çakışmasyı önlesin. Kendi classımızda oluşturduğumuzda yapmamız gereken bir durumdur.
    // direk olarak hashSet yaptığımızda zaten içerisinde bulunmaktadır.

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.isim);
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.isim, other.isim);
    }

    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }
    
}

public class Main {
    
    public static void main(String[] args) {
     
        Set<Player> hashset = new HashSet<Player>();
        
        Player player1 = new Player("Mustafa", 1);
        Player player2 = new Player("Mehmet", 10);
        Player player3 = new Player("Emre", 6);
        Player player4 = new Player("Mustafa", 1);
        
        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);
        
        for(Player p : hashset){
        
            System.out.println(p);
        }
        
        
        
        
        
        
        
        
        
        /*hashset.add("Java");
        hashset.add("Python");
        hashset.add("C++");
        
        hashset.add("C++"); //daha önce eklendiği için aynı hashcode'a sahip bir değer eklenemez.
        
        
        for(String s : hashset){
        
            System.out.println(s);
        }*/
        
        
        
        
    }
}
