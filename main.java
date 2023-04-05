import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int k, l = 0, sayi = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++){
            if(i % 3 == 0 && i % 4 == 0) {
                l += i;
                sayi++;
            }
        }
        ortalama = l / sayi;
        System.out.println("Ortalama" +ortalama);




    }
}