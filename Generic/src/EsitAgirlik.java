import java.util.Scanner;

public class EsitAgirlik extends Ogrenci
{
    Scanner scanner = new Scanner(System.in);
    private int edebiyatNet;
    private int tarihNet;
    private int cograftaNet;
    public EsitAgirlik(String ogrenciIsim)
    {
        super(ogrenciIsim);
        System.out.println("Cografya netini gir:");
        this.cograftaNet = scanner.nextInt();
        System.out.println("Edebiyat netini gir:");
        this.edebiyatNet = scanner.nextInt();
        System.out.println("Tarih netini gir:");
        this.tarihNet = scanner.nextInt();
        System.out.println(ogrenciIsim + " ogrenicisinin puani: " + puanHesapla());
    }

    @Override
    double puanHesapla()
    {
        double puan = getMatematiknet() * 1.7 + getTurkcenet() * 1.9  + edebiyatNet * 1.9 + tarihNet * 1.5 + cograftaNet * 1.5;
        return puan;
    }
}
