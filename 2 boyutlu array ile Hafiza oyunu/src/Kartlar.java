public class Kartlar
{

    private String deger;
    private boolean tahmin = false;

    public Kartlar(String deger)
    {
        this.deger = deger;
    }

    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }

}
