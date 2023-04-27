import java.util.Random;

public class Randomclassi {

    public static void main(String[] args) {


        Random rnd=new Random();

        int sayi;

        sayi=rnd.nextInt();
        System.out.println("sayi :" +sayi);


        int sayi1=rnd.nextInt(5);
        System.out.println("sayi1 = " + sayi1);


        System.out.println();



    }



}
