import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        //Değişkenlerimizi oluşturuyoruz
        int a,b;
        double c;

        //değer alabilmek için scannerı kullanıyoruz
        Scanner input=new Scanner(System.in);

        System.out.print("1'nci kenarı giriniz:");
        a=input.nextInt();

        System.out.print("2'nci kenarı giriniz");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs "+c+" değeridir");

    }
}
