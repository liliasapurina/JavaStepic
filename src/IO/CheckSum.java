package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckSum {

    public static InputStream getStream(byte [] data)  {
        return new ByteArrayInputStream(data);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int nextByte = inputStream.read();
        int checkSum = 0;
        while (nextByte != -1) {
            checkSum = Integer.rotateLeft(checkSum, 1) ^ (nextByte & 0xFF);
            nextByte = inputStream.read();
        }
        return checkSum;
    }

    public static void main(String[] args) throws IOException{
        InputStream stream;
        int result;
        stream = getStream( new byte[] { 0x33, 0x45, 0x01});

        result = checkSumOfStream(stream);
        System.out.print(result);
    }
}
