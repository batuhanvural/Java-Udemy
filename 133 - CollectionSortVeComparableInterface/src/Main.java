
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player>{

    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "|| " + "id= " + id + " isim= " + isim + " ||" ;
    }

    @Override
    public int compareTo(Player player) {
        
        if(this.id < player.id){
        
            return -1;
        }
        else if(this.id > player.id){
        
            return 1;
        }
        
        return 0;
    }
    

}


public class Main {
    public static void main(String[] args) {
        
       /* List<String> list_string = new ArrayList<String>();
        
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string);
        
        for(String s : list_string){
        
            System.out.println(s);
        }*/
       
       List<Player> list_player = new ArrayList<Player>();
       
       list_player.add(new Player("Batu",5));
       list_player.add(new Player("Han",1));
       list_player.add(new Player("Vural",10));
       list_player.add(new Player("Oguz",4));
       
       Player p1 = new Player("Batu", 5);
       Player p2 = new Player("Oguz", 4);
       
       // System.out.println(p1.compareTo(p1)); //p1 p2 = 1 || p2 p1 = -1 || p1 p1 = 0 (id'leri kontrol ediyor)
       /*Collections.sort(list_player);
       
       for(Player p : list_player){
       
           System.out.println(p);
       }*/
       
       Set<Player> treeset = new TreeSet<Player>();
       
       treeset.add(new Player("Murat",5));
       treeset.add(new Player("Emre",1));
       treeset.add(new Player("Oğuz",10));
       treeset.add(new Player("Yusuf",4));
       
       for(Player p : treeset){
       
           System.out.println(p);
       }
        
        
    }
    
}
