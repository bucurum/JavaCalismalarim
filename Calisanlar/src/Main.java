import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String islemler = "******************\n" +
                "Islemler \n" +
                "1. Yazilimci islemleri \n" +
                "2. Yonetici islemleri \n" +
                "q. Cikis \n" +
                "******************";

        Yazilimci yazilimci = new Yazilimci("Berke", "Ucurum", "7", "Java, C", 2500);
        Yonetici yonetici = new Yonetici("Ali", "Pelen", "2", 1, 4000);

        while (true)
        {
            System.out.println(islemler);
            String islem = scanner.nextLine();

            if (islem.equals("q"))
            {
                break;
            }else if (islem.equals("1"))
            {
                String yazilimciIslemler = "************\n" +
                        "1. Format At\n" +
                        "2. Bilgileri Goster\n" +
                        "q. Ust menu\n" +
                        "************";
                while (true)
                {
                    System.out.println(yazilimciIslemler);
                    String yazilimciIslem = scanner.nextLine();
                    if (yazilimciIslem.equals("q"))
                        break;
                    else if (yazilimciIslem.equals("1"))
                    {
                        System.out.println("Format atilacak isletim sistemini giriniz: ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    }else if (yazilimciIslem.equals("2"))
                    {
                        yazilimci.bilgileriGoster();
                    }else
                        System.out.println("Hatali tuslama yaptiniz");
                }

            }else if (islem.equals("2"))
            {
                String yoneticiIslemler ="************\n" +
                        "1.Zam Yap\n" +
                        "2.Bilgileri Goster\n" +
                        "q Ust Menu\n" +
                        "************";
                while (true)
                {
                    System.out.println(yoneticiIslemler);
                    String yoneticiIslem = scanner.nextLine();
                    if (yoneticiIslem.equals("q"))
                        break;
                    else if (yoneticiIslem.equals("1"))
                    {
                        System.out.println("Yapilacak Zam Miktarini Giriniz: ");
                        int zammiktari = scanner.nextInt();
                        yazilimci.zam(zammiktari);
                    }else if (yoneticiIslem.equals("2"))
                    {
                        yonetici.bilgileriGoster();
                    }else
                        System.out.println("Hatali tuslama yaptiniz");
                }
            }else
                System.out.println("Hatali tuslama yaptiniz");

        }
    }
}
