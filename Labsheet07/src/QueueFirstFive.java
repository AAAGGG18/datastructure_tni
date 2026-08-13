import java.util.LinkedList;
import java.util.Queue;

public class QueueFirstFive {

	public static void main(String[] args) {
		
		Queue<Integer> n_queue = new LinkedList<Integer>();
		
		// เก็บหมายเลข 101 ถึง 110
		for (int i = 101; i <= 110; i++) {
			n_queue.add(i);
		}
		
		// แสดง Queue ทั้งหมด
		System.out.println("Queue => " + n_queue);
		
		// แสดงผล 5 ตัวแรก
		for (int i = 0; i < 5; i++) {
			System.out.println(n_queue.toArray()[i]);
		}
		
		// แสดง Queue อีกครั้ง
		System.out.println("Queue => " + n_queue);
	}
}