import java.util.Scanner;

public class Main639 {
    public static int max = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            char[][] arr = new char[n][n];
            String[] a = new String[n];

            in.nextLine();
//            System.out.println();

            max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLine();
//                System.out.println(i +" "+ a[i]);
                arr[i] = a[i].toCharArray();
//                System.out.println(arr[i]);
            }
//            for(int i = 0; i< n; i++){
//                    arr[i] = a[i].toCharArray();
//                System.out.println(arr[i]);
//            }

            board(arr, 0);
            System.out.println(max);
        }
    }

    public static void board(char[][] arr, int num) {
        if (num > max) {
            max = num;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == '.' && check(arr, i, j)) {
                    arr[i][j] = 'O';
                    board(arr, num + 1);
                    arr[i][j] = '.';
                }
            }
        }
    }

    public static boolean check(char[][] arr, int i, int j) {
        boolean check = true;
        int n = arr.length;
        int k;
        for (k = j - 1; k >= 0; k--) {
            if (arr[i][k] == 'X') {
                check = true;
                break;
            }
            if (arr[i][k] == 'O') {
                return false;
            }
        }
        for (k = j + 1; k < n; k++) {
            if (arr[i][k] == 'X') {
                check = true;
                break;
            }
            if (arr[i][k] == 'O') {
                return false;
            }
        }
        for (k = i - 1; k >= 0; k--) {
            if (arr[k][j] == 'X') {
                check = true;
                break;
            }
            if (arr[k][j] == 'O') {
                return false;
            }
        }
        for (k = i + 1; k < n; k++) {
            if (arr[k][j] == 'X') {
                check = true;
                break;
            }
            if (arr[k][j] == 'O') {
                return false;
            }
        }
        return check;
    }
}
