/*
Story

House sam:
    s: 7 => start house sam
    t: 10=> end house sam

Tree distance:
    a: 4 => apple tree is located
    b: 12=> orange tree is located

total fruit:
    m: 3 => many apples     {apples : [2,3,-4]}
    n: 3 => many oranges    {oranges: [3,-2,-4]}

 Adding each apple distance to the position of the tree, they land at
 *apple*
 [4+2,4+3,4+-4] = [6,7,0]           => 1 {7}

 *orange*
 [12+3,12+-2,12+-4] = [15,10,8]     => 2 {10,8}
*/

/*
Function Description


s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree.

7 11
5 15
3 2
-2 2 1
5 -6

2 3
1 5
1 1
2
-2
 */


import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int orange;
    private static int apple;
    public static void main(String[] args) {
        ArrayList<Integer> apples = new ArrayList<>();
        ArrayList<Integer> oranges = new ArrayList<>();
        apples.add(2);

        oranges.add(-2);

        countApplesAndOranges(2 ,3, 1,5, apples,oranges);
    }

    public static int countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        for (int i =0; i<apples.size(); i++){
            if ((a + apples.get(i) >= s) && (a + apples.get(i) <= t)){
                apple++;
            }

        }
        for (int i =0; i<oranges.size(); i++){
            if ((b + oranges.get(i) >= s) && (b + oranges.get(i) <= t)){
                orange++;
            }
        }


        System.out.println(apple);
        System.out.println(orange);
        return 0;
    }


}