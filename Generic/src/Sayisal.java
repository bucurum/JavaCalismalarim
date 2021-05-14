import java.util.Scanner;

public class Sayisal extends Ogrenci
{
    Scanner scanner = new Scanner(System.in);
    private int fizikNet;
    private int biyolojiNet;
    private int kimyaNet;

    public Sayisal(String ogrenciIsim)
    {
        super(ogrenciIsim);
        System.out.println("Biyoloji netini gir:");
        this.biyolojiNet = scanner.nextInt();
        System.out.println("fizik netini gir:");
        this.fizikNet = scanner.nextInt();
        System.out.println("kimya netini gir:");
        this.kimyaNet = scanner.nextInt();
        System.out.println(ogrenciIsim + " ogrencisinin puani: " + puanHesapla());
    }

    @Override
    double puanHesapla()
    {
        double puan = fizikNet * 1.9 + biyolojiNet * 1.5 + kimyaNet * 1.5 + getMatematiknet() * 1.9 + getTurkcenet() * 1.7 ;
        return puan;
    }
}
