import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Sayı giriniz");
        int number= girdi.nextInt();

        int total=0;
        for (int i=1; i<number; i++){
            if(number%i ==0)    {
                total +=i;
            }
        }

        if (total == number){
            System.out.println(number + " mukemmel sayıdır");
        }

        else {
            System.out.println(number + " mukemmel sayı degildir");
        }
    }
}
