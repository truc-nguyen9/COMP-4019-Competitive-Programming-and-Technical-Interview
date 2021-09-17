import java.util.*;

public class Main11459 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int testCase = 1; testCase <= t; testCase++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            int[] player = new int[a];
            int[] roll = new int[c];
            int[] x = new int[b];
            int[] y = new int[b];
            int i;

            for (i = 0; i < b; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }
            for (i = 0; i < c; i++) {
                roll[i] = in.nextInt();
            }
            for (i = 0; i < a; i++) {
                player[i] = 1;
            }
            int j = 0;
            boolean notWin  = true;
            do {
                for (i = 0; i < c; i++) {
                    if (player[j] + roll[i] >= 100){
                        player[j] = 100;
                        notWin = false;
                        break;
                    }
                    else {
                        player[j] += roll[i];
                        player[j] = check(x, y, player[j]);
                    }
                    if(player[j] == 100){
                        notWin = false;
                        break;
                    }
                    j++;
                    if (j >= a) {
                        j = 0;
                    }
                }
                notWin = false;
            }
            while (notWin);

            for (i = 0; i < a; i++) {
                System.out.println("Position of player " + (i + 1) + " is " + player[i] + ".");
            }
        }
    }

    public static int check(int[] x, int[] y, int player) {
        boolean notFinish = true;
        int i = 0;
        do{
            if (x[i] == player) {
                if (x[i] < y[i]) {
                    player = y[i];

                } else {
                    player = y[i];
                }
                notFinish = false;
            }
            i++;
        }
        while (i < x.length && notFinish);
        return player;

    }
}
