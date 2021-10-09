import java.util.*;

public class Main628 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int numDict = in.nextInt();
            int i,j;
            String[] word = new String[numDict];
            for(i = 0; i< numDict; i++){
                word[i] = in.next();
            }

            int numRule = in.nextInt();
            String[] rule = new String[numRule];
            for (i = 0; i < numRule; i++){
                rule[i] = in.next();
            }

            System.out.println("--");
            for(i = 0; i < numDict; i++){
                for( j = 0; j < numRule; j++){
                    String w = word[i];
                    String r = rule[j];
                    r = r.replaceAll("#", w);
                    r = r.replaceAll("0", "-");

                    int k = r.indexOf('-');
                    foo(r, k);
                }
            }
        }
    }
    
    private static void foo(String s, int k){
      if (k == -1){
              System.out.println(s);
      }
      else {

          for (int i = 0; i < 10; i++) {
              char ch = (char) (i + '0');
              String s1 = s.substring(0, k) + ch + s.substring(k + 1);
              int nextk = s1.indexOf('-');
              foo(s1, nextk);
          }
      }
    }
}
