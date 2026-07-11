import java.util.ArrayList;

public class Lab202 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};


        String studentId = "2513110524";


        for (int n : initial_numbers) {
            numbers.add(n);
        }


        int addValue = 100;
        numbers.add(addValue);


        int insertIndex = Character.getNumericValue(
                studentId.charAt(studentId.length() - 1));
        int insertValue = 200;
        numbers.add(insertIndex, insertValue);


        int deleteIndex = Character.getNumericValue(
                studentId.charAt(studentId.length() - 2));
        numbers.remove(deleteIndex);


        int updateIndex = Character.getNumericValue(
                studentId.charAt(studentId.length() - 3));
        int today = 9;
        numbers.set(updateIndex, today);


        System.out.println(numbers);
    }
}