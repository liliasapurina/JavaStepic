package IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by lilia on 03.07.17.
 */
public class Replace {

    public static void main(String[] args) throws IOException{
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        int nextByte;
        int curByte = inputStream.read();

        while (curByte != -1){
           nextByte = inputStream.read();

           if(nextByte == 10 && curByte == 13){
               curByte = nextByte;
               nextByte = inputStream.read();
           }

           outputStream.write(curByte);
           curByte = nextByte;
        }

    }
}
