package HammingCode;

import java.util.Scanner;

public class HammingCode {
    public static void main(String[] args) {
        int[] data = new int[4];
        int[] encodedBits = new int[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i != data.length; i++) {
            data[i] = in.nextInt();
        }
        encodedBits[2] = data[0];
        encodedBits[4] = data[0];
        encodedBits[5] = data[0];
        encodedBits[6] = data[0];

        int p1 = (data[0]) ^ (data[1]) ^ (data[3]);
        int p2 = (data[0]) ^ (data[2]) ^ (data[3]);
        int p3 = (data[1]) ^ (data[2]) ^ (data[3]);
        encodedBits[0] = p1;
        encodedBits[1] = p2;
        encodedBits[3] = p3;
        System.out.println("Answer is");
        for (int i : encodedBits) {
            System.out.print(i);
        }
        in.close();
    }
}