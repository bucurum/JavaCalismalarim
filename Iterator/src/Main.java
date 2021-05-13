import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Holgediniz...");
        String islemler = "**********************\n" +
                "1. Sehirleri Goruntule\n" +
                "2. Sonraki Sehire git\n" +
                "3. Onceki Sehire git\n" +
                "q. Cikis\n" +
                "**********************";
        LinkedList<String> sehirler = new LinkedList<String>();
        sehirler.add("ankara");
        sehirler.add("istanbul");
        sehirler.add("izmir");
        sehirler.add("corum");

        ListIterator<String> iterator = sehirler.listIterator();
        boolean dogruluk = true;
        boolean ileri = true;
        Scanner scanner = new Scanner(System.in);
        while (dogruluk)
        {
            System.out.println(islemler);
            String i = scanner.nextLine();
            switch (i)
            {
                case "q":
                    System.out.println("Iyi Gunler...");
                    dogruluk = false;
                    break;
                case "1":
                    System.out.println(sehirler);
                    break;
                case "2":
                    if (!ileri)
                    {
                        if (iterator.hasNext())
                        {
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Sonraki sehre gidiliyor: " + iterator.next());
                    } else
                        System.out.println("Gidilecek son sehir burasiydi... ");
                    break;
                case "3":
                    if (ileri)
                    {
                        if (iterator.hasPrevious())
                        {
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious())
                    {
                        System.out.println("Onceki sehre gidiliyor: " + iterator.previous());
                    }else
                        System.out.println("Gidilecek ilk sehir burasiydi... ");
                    break;
                default:
                    System.out.println("Hatali tuslama yaptiniz");
            }

        }


    }
}
