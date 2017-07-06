import java.util.HashSet;
import java.util.Set;

/**
 * Created by lilia on 06.07.17.
 */
public class SymDiv {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> intersection = new HashSet<T>(set1);
        intersection.retainAll(set2);

        Set<T> union = new HashSet<T>(set1);
        union.addAll(set2);

        union.removeAll(intersection);

        return union;
    }

    public static void main(String[] args) {

        Set<Integer> a= new HashSet<>();
        Set <Integer> b = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);

        b.add(0);
        b.add(1);
        b.add(2);

        System.out.println(symmetricDifference(a, b));
    }
}
