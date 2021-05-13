import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ID: 2, SIFRE: 1234");
        ATM atm = new ATM();
        Hesap hesap1 = new Hesap(1 , 111111, 1234 , 111111, 2000);
        Hesap hesap2 = new Hesap(2,222222 , 1234, 222222, 14300);
        atm.calis(hesap2);

    }
}
