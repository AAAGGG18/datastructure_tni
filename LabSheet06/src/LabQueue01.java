import java.util.ArrayDeque;
import java.util.Queue;

public class LabQueue01 {

    public static void main(String[] args) {
        Queue<Integer> q_number = new ArrayDeque<Integer>();

        for (int i = 101; i <= 105; i++) {
            q_number.offer(i);
            System.out.println("Enqueue: " + i);
        }
        System.out.println("Queue => " + q_number);
        System.out.println();

        while (!q_number.isEmpty()) {
            int next = q_number.peek();          // ดูหมายเลขคิวถัดไป ยังไม่ลบ
            System.out.println("Calling number: " + next);

            int served = q_number.poll();        // ประกาศเรียกคิว ลบออกจากคิว
            System.out.println("Providing service number: " + served);
            System.out.println();
        }

        System.out.println("Queue => " + q_number);
    }
}