package Practice_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Setオブジェクトの操作を練習する
        Set<String> h = new HashSet<String>();

        h.add("a");
        h.add("b");
        h.add("c");
        h.add("a");
        h.add("Japan");

        System.out.println(h);

        h.remove("a");

        System.out.println(h);

        Iterator<String> iterator = h.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

        //To find Union
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        //To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        //To find the symmetric differences
        Set<Integer> differences = new HashSet<Integer>(a);
        differences.removeAll(b);
        System.out.println(differences);







    }
}
