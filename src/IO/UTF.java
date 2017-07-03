package IO;

import java.io.IOException;

/**
 * Created by lilia on 03.07.17.
 */
public class UTF {
    public static void main(String[] args) throws IOException {
        for(byte c : "Ы".getBytes("UTF-8")){
            System.out.println(Byte.toUnsignedInt(c));
        }
    }
}
