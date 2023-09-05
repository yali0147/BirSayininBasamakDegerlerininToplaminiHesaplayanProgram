import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bir sayının basamak değerlerini toplama aracı ");

        Scanner imp =new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number =imp.nextInt();
        int basValue,result=0;
        while (number !=0){
            basValue=number%10;
            result+=basValue;
            number/=10;
        }
        System.out.print("Sayınızın basamak değerlerinin toplamı : "+result);
    }
}