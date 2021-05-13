import java.util.Scanner;

public class Giris
{
    public boolean login(Hesap hesap1)
    {
        int id;
        int sifre;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Kullanici id'sini giriniz ");
        id = scanner.nextInt();
        System.out.println("Kullanici sifresini giriniz ");
        sifre = scanner.nextInt();

        if (hesap1.getId() == id && hesap1.getSifre() == sifre)
        {
            return true;
        }else
            return false;

    }
}
