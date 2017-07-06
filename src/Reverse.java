import java.io.InputStream;
import java.util.*;

public class Reverse {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int i = 1;
        while(in.hasNext()){
            if(i % 2 == 0){
                a.add(in.nextInt());
            } else {
                in.nextInt();
            }
            i++;
        }
        in.close();
        Collections.reverse(a);

        for (Integer num : a) {
            System.out.print((num + " "));
        }
    }
}