import java.util.Scanner;

public class Main
{
    private static Kartlar [][] kartlar = new Kartlar[4][4];
    public static void main(String[] args)
    {
        kartlar[0][0] = new Kartlar("A");
        kartlar[0][1] = new Kartlar("1");
        kartlar[0][2] = new Kartlar("C");
        kartlar[0][3] = new Kartlar("D");
        kartlar[1][0] = new Kartlar("A");
        kartlar[1][1] = new Kartlar("B");
        kartlar[1][2] = new Kartlar("2");
        kartlar[1][3] = new Kartlar("4");
        kartlar[2][0] = new Kartlar("1");
        kartlar[2][1] = new Kartlar("C");
        kartlar[2][2] = new Kartlar("3");
        kartlar[2][3] = new Kartlar("4");
        kartlar[3][0] = new Kartlar("B");
        kartlar[3][1] = new Kartlar("2");
        kartlar[3][2] = new Kartlar("3");
        kartlar[3][3] = new Kartlar("D");

        while (oyunBitirme() == false)
        {
            oyunTahtasi();
            tahminler();
        }


    }
    public static void tahminler()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tahmin etmen istedigin kartin yerini gir ('0 1' seklinde arada 1 bosluk olarak): ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();

        System.out.println("Tahmin etmen istedigin kartin yerini gir ('0 1' seklinde arada 1 bosluk olarak): ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();

        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger())
        {
            System.out.println("Dogru tahmin, Tebrikler");
            kartlar[i2][j2].setTahmin(true);
        }else
        {
            System.out.println("Yanlis tahmin, Tekrar deneyin.");
            kartlar[i1][j1].setTahmin(false);
        }

    }

    public static void oyunTahtasi()
    {
        System.out.println("   0     1     2    3");
        for(int i = 0 ; i < 4 ; i++)
        {
            System.out.println("-----------------------");
            for (int j = 0; j < 4; j++)
            {
                if (kartlar[i][j].isTahmin() == true)
                {
                    System.out.print(" | " + kartlar[i][j].getDeger() + " | ");

                } else {

                    System.out.print(" |  | ");
                }
            }
            System.out.println(i + " ");
        }
    }

    public static boolean oyunBitirme()
    {
        for (int i = 0 ; i < 4 ; i++)
        {
            for (int j = 0 ; j < 4 ; j++)
            {
               if (kartlar[i][j].isTahmin() == false)
               {
                   return false;
               }
            }
        }
        System.out.println("Kazandiniz!!!");
        return true;
    }

}
