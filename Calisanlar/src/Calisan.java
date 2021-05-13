public class Calisan
{
    private String ad;
    private String soyad;
    private String id;
    private int maas;


    public Calisan(String ad, String soyad, String id, int maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
        this.maas = maas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void bilgileriGoster()
    {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Id: " + id);
        System.out.println("Maas: " + maas);
    }
    public void zam(int ZamMiktari)
    {
        maas += ZamMiktari;
    }
}
