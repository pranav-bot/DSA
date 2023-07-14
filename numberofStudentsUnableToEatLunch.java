import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class numberofStudentsUnableToEatLunch {
    public static void main(String[] args) {
        int[] students = { 1, 1, 1, 0, 0, 1 };
        int[] sandwiches = { 1, 0, 0, 0, 1, 1 };
        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stud = new LinkedList<Integer>();
        for (int i = 0; i != students.length; i++) {
            stud.add(students[i]);
        }
        Stack<Integer> sand = new Stack<>();
        for (int i = 0; i != sandwiches.length; i++) {
            sand.push(sandwiches[i]);
        }
        for (int i = 0; i != students.length; i++) {
            int count = 0;
            if (count > 0) {
                return stud.size();
            }
            if (stud.peek() != sand.peek()) {
                count++;
                int temp = stud.remove();
                stud.add(temp);
            }
            if (stud.peek() == sand.peek()) {
                sand.pop();
                stud.remove();
                count = 0;
            }
        }
        return 0;

    }

}
