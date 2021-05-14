import java.util.Scanner;

public abstract class Ogrenci
{
    Scanner scanner = new Scanner(System.in);
    private String ogrenciIsim;
    private int matematiknet;
    private int turkcenet;

    public Ogrenci(String ogrenciIsim)
    {
        System.out.println(ogrenciIsim + " icin ");
        this.ogrenciIsim = ogrenciIsim;
        System.out.println("matematik netini gir: ");
        this.matematiknet = scanner.nextInt();
        System.out.println("Turke netini gir: ");
        this.turkcenet = scanner.nextInt();
    }

    public String getOgrenciIsim() {
        return ogrenciIsim;
    }

    public void setOgrenciIsim(String ogrenciIsim) {
        this.ogrenciIsim = ogrenciIsim;
    }

    public int getMatematiknet() {
        return matematiknet;
    }

    public void setMatematiknet(int matematiknet) {
        this.matematiknet = matematiknet;
    }

    public int getTurkcenet() {
        return turkcenet;
    }

    public void setTurkcenet(int turkcenet) {
        this.turkcenet = turkcenet;
    }
    abstract double puanHesapla();

}
