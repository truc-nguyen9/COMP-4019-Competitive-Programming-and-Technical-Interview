import java.util.*;

public class Main11942 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        System.out.println("Lumberjacks:");
        for (int testCase = 1; testCase <= t; testCase++){
            int n[] = new int[10];
            int i;

            for (i = 0; i < 10; i++){
                n[i] = in.nextInt();
            }

            int j = 1;
            if (n[1] >= n[0]){
                while (j < 10) {
                    if (n[j] < n[j - 1]) {
                        System.out.println("Unordered");
                        break;
                    }
                    j++;

                    if (j == 10) {
                        System.out.println("Ordered");
                    }
                }
            }
            else{
                while (j < 10) {
                    if (n[j] > n[j - 1]) {
                        System.out.println("Unordered");
                        break;
                    }
                    j++;

                    if (j == 10) {
                        System.out.println("Ordered");
                    }
                }
            }
        }
    }
}
