import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int testCase = 1; testCase <= t; testCase++ ) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] x = new int[n];
            int total = 0;
            int max = 0;

            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                total += x[i];
                if (x[i] >= max) {
                    max = x[i];
                }
            }

            int l = max, u = total;
            int cap = binarySearch(x, l, u, m);

            System.out.println(cap);
        }
    }


    public static int binarySearch(int [] x, int l, int u, int m) {
        while (l < u) {
            int mid = (l + u) / 2;
            int sum = 0;
            int containers = 0;
            for (int value : x) {
                sum += value;
                if (sum > mid) {
                    sum = value;
                    containers++;
                } else if (sum == mid) {
                    sum = 0;
                    containers++;
                }
            }
            if (sum > 0) {
                containers++;
            }
            if (containers > m) {
                l = mid + 1;
            } else {
                u = mid;
            }
        }
        return l;
    }
}
