import java.lang.*;
import java.io.*;
import java.util.*;


public class nomor4 {
    public static void main(String[] args) {
        // reverse kalimat
        String x;
        Scanner y = new Scanner(System.in);

        System.out.println("Masukkan Kata :");
        x = y.nextLine();
 
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = x.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        System.out.println(new String(result));
    }
}
