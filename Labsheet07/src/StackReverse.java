import java.util.ArrayDeque;
import java.util.Deque;

public class StackReverse {

	public static String reverseCharacter(String original) {
		Deque<Character> stack = new ArrayDeque<Character>();
		
		// ใส่ตัวอักษรลงใน Stack
		for (int i = 0; i < original.length(); i++) {
			stack.push(original.charAt(i));
		}
		
		// ดึงตัวอักษรออกจาก Stack เพื่อให้ได้ข้อความย้อนกลับ
		String reverse = "";
		
		while (!stack.isEmpty()) {
			reverse += stack.pop();
		}
		
		return reverse;
	}

	public static void main(String[] args) {
		
		String original = "Hello World";
		
		System.out.println("Original => " + original);
		System.out.println("Reverse  => " + reverseCharacter(original));
	}
}