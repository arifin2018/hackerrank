import java.util.ArrayList;
import java.util.List;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int kangaroo = x1;
        int kangaroo2 = x2;

        for (int i=0; i<= 10000; i++){
            kangaroo+= v1;
            kangaroo2+= v2;
            if (kangaroo == kangaroo2){
                return "YES";
            }
        }
        return "NO";

    }
}
