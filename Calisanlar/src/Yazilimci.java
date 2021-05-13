public class Yazilimci extends Calisan
{

    private String diller;
    public Yazilimci(String ad, String soyad, String id, String diller, int maas)
    {
        super(ad, soyad, id, maas);
        this.diller = diller;
    }
    public void formatAt(String isletimSistemi)
    {
        System.out.println(getAd() + " " + isletimSistemi + " isletim sistemini yukluyor...");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println(isletimSistemi + " basari ile yuklendi.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazilimcinin bildigi diller: " + diller);
    }

}
