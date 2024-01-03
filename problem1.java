import java.util.ArrayList;
import java.util.Scanner;

class problem1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            int i = in.nextInt();
            if (i > 0) {
                arr.add(i);
            } else {
                break;
            }
        }
        processArray(arr);

    }

    static void processArray(ArrayList<Integer> arr) {
        for (int i = 0; i != arr.size(); i++) {
            if (arr.get(i) < 0 && arr.get(i + 1) < 0) {
                int sum = arr.get(i) + arr.get(i + 1);
                arr.remove(i);
                arr.remove(i);
                arr.add(i, sum);
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}