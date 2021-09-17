import java.util.*;

public class Main12503 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int testCase = 1; testCase <= t; testCase++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int i, pos = 0;

            for (i = 0; i < n; i++) {
                String input = in.next();

                if (input.equals("LEFT")) {
                    arr[i] = -1;
                } else if (input.equals("RIGHT")) {
                    arr[i] = 1;
                } else {
                    in.next();
                    int index = in.nextInt();
                    arr[i] = arr[index - 1];
                }
                pos += arr[i];
            }

            System.out.println(pos);
        }
    }

}
