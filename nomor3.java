import java.util.*;
import java.text.*;

public class nomor3 {
    public static void main(String[] args) {

        //Membuat format waktu dari 12 jam menjadi 24 jam

        Date HariSekarang = new Date( );
        SimpleDateFormat ft = 
        new SimpleDateFormat ("H:mm");
        System.out.println("Waktu saat ini: " + ft.format(HariSekarang));
    }
}
