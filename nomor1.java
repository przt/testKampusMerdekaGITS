import java.util.Scanner;

public class nomor1{
    public static void main(String[] args) {
        
        int x;
        Scanner y = new Scanner(System.in);

        System.out.println("Masukkan Angka :");
        x = y.nextInt();

        if(x % 3 == 0 && x % 5 == 0){
            System.out.println("Hello World");
        } else if(x % 3 == 0){
            System.out.println("Hello");
        } else if(x % 5 == 0){
            System.out.println("World");
        }
    }
}