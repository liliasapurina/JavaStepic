package IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by lilia on 03.07.17.
 */
public class Convert {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder result = new StringBuilder();

        int nextByte = reader.read();
        while (nextByte != -1) {
            result.append((char) nextByte);
            nextByte = reader.read();
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException{
        String result;
        InputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        Charset charset = StandardCharsets.US_ASCII;
        result = readAsString(inputStream, charset);

        System.out.print(result);
    }
}
