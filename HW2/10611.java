
import java.util.*;

public class Main10611 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }

        int num = in.nextInt();
        int[] chimp = new int[num];
        for (int i = 0; i < num; i++) {
            chimp[i] = in.nextInt();
        }

        for (int i = 0; i < chimp.length; i++) {
            int q = chimp[i];
            int min = -1, max = -1;
            int a = 0, b = 0;
            int l = 0, u = x.length - 1;

            if (q == x[l] && q == x[u]) {
                min = -1;
                max = -1;
            } else if (q == x[l]) {
                min = -1;
                a = l + 1;
                while (q == x[a]) {
                    a++;
                }
                max = x[a];
            } else if (q == x[u]) {
                max = -1;
                b = u - 1;
                while (q == x[b]) {
                    b--;
                }
                min = x[b];
            } else if (q < x[l]) {
                min = -1;
                max = x[l];
            } else if (q > x[u]) {
                max = -1;
                min = x[u];
            } else {
                while (l < u) {
                    int m = (l + u) / 2;

                    if (x[m] < q && x[m + 1] > q) {
                        min = x[m];
                        max = x[m + 1];
                        break;
                    } else if (x[m] == q) {
                        int j = m - 1;
                        int k = m + 1;

                        if (x[m] == x[j] || x[m] == x[k]) {
                            while (x[j] == q) {
                                j--;
                            }
                            while (x[k] == q) {
                                k++;
                            }
                            min = x[j];
                            max = x[k];
                            break;
                        } else {
                            min = x[m-1];
                            max = x[m+1];
                            break;
                        }
                    } else if (x[m] > q) {
                        u = m;
                    } else if (x[m] < q) {
                        l = m + 1;
                    }
                }
            }

            if (min == -1 && max == -1) {
                System.out.println("X X");
            } else if (min == -1) {
                System.out.println("X " + max);
            } else if (max == -1) {
                System.out.println(min + " X");
            } else {
                System.out.println(min + " " + max);
            }
        }
    }
}