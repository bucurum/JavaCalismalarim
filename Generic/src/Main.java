public class Main
{
    public static void main(String[] args)
    {
        Sayisal sayisalogrenci1 = new Sayisal("berke");
        //Sayisal sayisalogrenci2 = new Sayisal("Tarik");
        EsitAgirlik esitAgirlikogrenci1 = new EsitAgirlik("Furkan");

        System.out.println("*****************************\n" +
                "Yuksek puan alan kisi: " + birinciBul(sayisalogrenci1,esitAgirlikogrenci1).getOgrenciIsim());
    }

    public static <E extends Ogrenci> E birinciBul(E e1, E e2)
    {
        if (e1.puanHesapla() > e2.puanHesapla())
        {
            return e1;
        }
        else
            return e2;
    }
}
