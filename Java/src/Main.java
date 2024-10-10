import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int a;
        int total = 0;

        Scanner scan = new Scanner(System.in);



        do{
            System.out.print("Lütfen bir sayı giriniz : ");
            a = scan.nextInt();

            if(a % 2 == 1){
                total += a;
            }


        }while(a > 0);
        System.out.println("Total : " + total);
    }
}