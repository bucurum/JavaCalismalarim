public class Yonetici extends Calisan
{
    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, String id, int sorumluKisiSayisi, int maas)
    {
        super(ad, soyad, id, maas);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Sorumlu oldugu kisi sayisi: " + sorumluKisiSayisi);
    }


}
