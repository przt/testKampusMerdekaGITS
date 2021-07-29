import java.util.Scanner;

public class nomor5 {
    public static void main(String[] args) {
        String kalimat1, kalimat2="";

        Scanner y = new Scanner(System.in);

        System.out.println("Masukkan Kalimat untuk menentukan polindrom : ");

        kalimat1 = y.nextLine();

        int panjangKalimat = kalimat1.length();

        for(int i = panjangKalimat -1;i>=0;i--){
            kalimat2 = kalimat2 + kalimat1.charAt(i);
        }

        // decision untuk menentukan kalimat
        if(kalimat1.equals(kalimat2)){
            System.out.println("Kalimat "+ kalimat1 + " merupakan kalimat polindrom");
        } else{
            System.out.println("Kalimat "+ kalimat1 + " bukan merupakan kalimat polindrom");
        }
    }
}
