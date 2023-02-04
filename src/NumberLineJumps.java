import java.util.ArrayList;
import java.util.List;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(4523, 8092, 9419, 8076));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        List<Integer> intArray = new ArrayList<Integer>();
        int kangoroo1 = x1;
        int kangoroo2 = x2;

        while(kangoroo1 <= 10000 && kangoroo2 <= 10000){
            System.out.println(kangoroo1);
            System.out.println(v2);
            kangoroo1 += v1;
            intArray.add(kangoroo1);

            kangoroo2 += v2;
            for (int x=0; x<intArray.size(); x++){
                if (intArray.get(x) == kangoroo2){
                    return "YES";
                }
            }
        }
        return "NO";
    }

}
