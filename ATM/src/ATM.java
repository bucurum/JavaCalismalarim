import java.util.Scanner;

public class ATM
{
    public boolean calis(Hesap hesap)
    {
        Giris giris = new Giris();

        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        while (true)
        {

            if (giris.login(hesap))
            {
                System.out.println("Hosgeldiniz");
                break;
            }
            else
            {
                System.out.println("Yanlis id ve ya sifre");
                giris_hakki -= 1;
            }

            if (giris_hakki == 0)
                return false;

        }
        System.out.println("Hesap numaran: " + hesap.getHesapNo());
        String yazdir = "********************** \n" +
                "Para cekmek icin 1'i \n" +
                "Para Yatirmak icin 2'yi \n" +
                "Bakiyeni gormek icin 3'u tusla \n" +
                "Cikmak icin 0'i tuslayiniz \n" +
                "**********************";


        while(true)
        {
            System.out.println(yazdir);
            int i = scanner.nextInt();
            switch (i)
            {
                case 0:
                    System.out.println("Gule Gule");
                    return false;
                case 1:
                    hesap.paraCek();
                    break;
                case 2:
                    hesap.paraYatir();
                    break;
                case 3:
                    System.out.println("Bakiyeniz: " + hesap.getBakiye());
                    break;
                default:
                    System.out.println("Gecersiz tuslama yaptiniz ");
                    break;
            }
        }

    }


}
