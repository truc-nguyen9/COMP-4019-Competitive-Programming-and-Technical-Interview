import java.util.*;

public class Main12015 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int testCase = 1; testCase <= t; testCase++){

            String[] str = new String[10];
            int[] n = new int[10];

            int i;
            for(i = 0; i < 10; i++){
                str[i] = in.next();
                n[i] = in.nextInt();
            }

            int max = n[0];
            for (i = 1; i < 10; i++){
                if (n[i] > max){
                    max = n[i];
                }
            }
            System.out.println("Case #" + testCase + ":" );
            for (i = 0; i < 10; i++){
                if (n[i] == max){
                    System.out.println(str[i]);
                }
            }
        }
    }
}
