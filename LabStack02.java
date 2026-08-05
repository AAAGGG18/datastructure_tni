import java.util.Stack;

public class LabStack02 {
    public static void main(String[] args) {
        int[] trainCars = {1, 2, 3, 4, 5};
        Stack<Integer> track = new Stack<>();

       
        for (int i = 0; i < trainCars.length; i++) {
            track.push(trainCars[i]);
            System.out.println("Push in track : " + trainCars[i]);
        }
        System.out.println("Train car after into dead-end track : " + track);

        System.out.println();

       
        while (!track.isEmpty()) {
            int car = track.pop();
            System.out.println("Pop from track: " + car);
        }
        System.out.println("Train car after out of dead-end track : " + track);
    }
}