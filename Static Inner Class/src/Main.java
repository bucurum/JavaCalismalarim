import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hosgeldiniz...");
        String islemler = "************\n" +
                "1. Matematik islemleri\n" +
                "2. Fizik islemleri\n" +
                "q. Cikis";
        String islemlerMat = "************\n" +
                "1. Daire alani hesapla\n" +
                "2. Silindir alani hesapla\n" +
                "3. Elips alani hesapla\n" +
                "q. Ust menu";
        String islemlerFizik = "************\n" +
                "1. 2 Vektorun ic carpimi\n" +
                "2. Statik eneri hesaplama\n" +
                "3. Potansiyel enerji hesaplama\n" +
                "q. Ust menu";
        while (true)
        {
            System.out.println(islemler);
            String islem = scanner.nextLine();
            if (islem.equals("q"))
            {
                System.out.println("Iyi gunler...");
                break;

            }else if (islem.equals("1"))
            {
                while (true)
                {
                    System.out.println(islemlerMat);
                    String islemmat = scanner.nextLine();
                    if (islemmat.equals("q"))
                    {
                        System.out.println("Ust menuye cikiliyor...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;

                    }else if (islemmat.equals("1"))
                    {
                        System.out.print("Yaricap gir:");
                        int yaricap = scanner.nextInt();
                        Problem.Matematic.DaireAlan(yaricap);
                        scanner.nextLine();

                    }else if (islemmat.equals("2"))
                    {
                        System.out.println("Yaricap ve yukseklik degerlerini giriniz: ");
                        System.out.print("Yaricap: ");
                        int yaricap = scanner.nextInt();
                        System.out.print("Yukseklik: ");
                        int yukseklik = scanner.nextInt();
                        Problem.Matematic.SilindirAlan(yaricap, yukseklik);
                        scanner.nextLine();

                    }else if (islemmat.equals("3"))
                    {
                        System.out.println("Yaricap degerlerini giriniz: ");
                        System.out.print("Yaricap1: ");
                        int yaricap1 = scanner.nextInt();
                        System.out.print("Yaricap2: ");
                        int yaricap2 = scanner.nextInt();
                        Problem.Matematic.ElipsALan(yaricap1, yaricap2);
                        scanner.nextLine();

                    }else
                    {
                        System.out.println("Hatali tuslama yaptiniz...");
                    }
                }
            }else if (islem.equals("2"))
            {
                while (true)
                {
                    System.out.println(islemlerFizik);
                    String islemfizik = scanner.nextLine();
                    if (islemfizik.equals("q"))
                    {
                        System.out.println("Ust menuye cikiliyor...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;

                    }else if (islemfizik.equals("1"))
                    {
                        Vector vector1 = new Vector("Vektor1");
                        Vector vektor2 = new Vector("Vektor2");
                        Problem.Fizik.vektorCarpim(vector1, vektor2);

                    }else if (islemfizik.equals("2"))
                    {
                        System.out.println("Cismin Kutlesini ve Hizini giriniz: ");
                        System.out.print("Kutlesi: ");
                        int kutle = scanner.nextInt();
                        System.out.print("Hizi: ");
                        int hiz = scanner.nextInt();
                        Problem.Fizik.statikEnerji(kutle, hiz);
                        scanner.nextLine();

                    }else if (islemfizik.equals("3"))
                    {
                        System.out.println("Cismin Kutlesini ve Yerden Yuksekligini giriniz: ");
                        System.out.print("Kutlesi: ");
                        int kutle = scanner.nextInt();
                        System.out.print("Yuksekligi: ");
                        int yukseklik = scanner.nextInt();
                        Problem.Fizik.potansiyelEnerji(kutle, yukseklik);
                        scanner.nextLine();

                    }else
                    {
                        System.out.println("Hatali tuslama yaptiniz...");
                    }
                }
            }else
            {
                System.out.println("Hatali tuslama yaptiniz...");
            }
        }
    }
}
