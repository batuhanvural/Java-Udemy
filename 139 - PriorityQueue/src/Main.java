
import java.util.PriorityQueue;
import java.util.Queue;

/*
PriprityQueue normal queue mantığı gibi davranmaz. Elemanlar öncelik sıralarına göre 
(
    Integerlarda yüksek öncelik en küçük sayıda, en düşük öncelik büyük sayıda.
    Stringlerde en yüksek öncelik alfabetik sıralamada
)
kuyrukta önlere geçer (hastane acil servisleri gibi (öncelik sırası))






*/

class Player implements Comparable<Player>{

    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public int compareTo(Player player) {
        
        if (this.id < player.id) {
            return -1;
        }else if(this.id > player.id){
            return 1;
        }
        return 0;
        
        
    }

    @Override
    public String toString() {
        return "Player{" + "isim=" + isim + ", id=" + id + '}';
    }

}


public class Main {
    public static void main(String[] args) {
        
        
        
        Queue<Player> queue = new PriorityQueue<Player>();
        
        queue.offer(new Player("Batuhan", 5));
        queue.offer(new Player("Ali", 1));
        queue.offer(new Player("Mehmet", 100));
        
        while (!queue.isEmpty()) {           
            
            System.out.println("Eleman çıkarılıyor: "+queue.poll());
            
        }
        
        
        /*
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);
        
        /*for (Integer i : queue) { //en üstte açıklamada belirttiğimiz öncelik sırasını foreach döngüde göremiyoruz.
            System.out.println(i);
            
        }
        
        System.out.println(queue.peek()); //kuyruğun ilk elemanını gösterir.
        System.out.println(queue.contains(100)); //içine yazdığımız eleman mevcut mu değil mi onu kontrol ediyor.

        //queue.clear(); // kuyruğu temizlediğimiz için aşağıdaki kodda çıktı göremiyoruz.
        
        while (!queue.isEmpty()) { // Bu yöntemle görebiliyoruz, çünkü poll stackteki en ön elemanı gösterip kaldırır.
            System.out.println("Eleman çıkarılıyor: " + queue.poll());
            
        }*/
        
        
        
        
        
        
        
        
        
    }
    
}
