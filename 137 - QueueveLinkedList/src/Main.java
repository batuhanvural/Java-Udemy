
import java.util.LinkedList;
import java.util.Queue;

/*
add(Eleman)   --> elemanı kuyruğa ekler. ekleyemezse hata verir.
offer(Eleman) --> elemanı kuyruğa ekler. eklerse true ekleyemezse false döner
poll()        --> kuyruğun en başındaki elemanı kuyruktan çıkarır. boşsa null döner.
peek()        --> en başındaki elemanı döner. boşsa null döner.
 
*/
public class Main {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<String>();
        
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
        
        System.out.println(queue.peek()); // ilk elemanı dönüyor
        
        for(String s : queue){
        
            System.out.println(s);
        }
        System.out.println("-------------");
        System.out.println("Eleman çıkarılıyor..." + queue.poll());
        System.out.println(queue);
        
        while (!queue.isEmpty()) {    
            System.out.println("Eleman çıkarılıyor: "+queue.poll());
        }
        
    }
    
}
