import java.util.regex.*;    
import java.util.*;
import java.util.Scanner;


public class nomor2 {
    public static void main(String[] args) {

        String formatEmail1 = "[a-zA-Z0-9._-]+@[a-z]+\\.+co.id+";
        String formatEmail2 = "[a-zA-Z0-9._-]+@[a-z]+\\.+id+";

        String emails;
        Scanner y = new Scanner(System.in);
        System.out.println("Masukkan Email :");
        emails = y.nextLine();

        String[] emailFinal = emails.split("@");
   
        // String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        // Pattern pattern = Pattern.compile(regex);
   
        //     Matcher matcher = pattern.matcher(emails);  
        //     System.out.println(emails +" : "+ matcher.matches()+"\n");           
        if (emails.matches(formatEmail1) && emailFinal[0].length()<20||emails.matches(formatEmail2) && emailFinal[0].length()<20) {
            System.out.println("Format email benar");
        } else {
            System.out.println("Format email salah");
        } 
    }
}
