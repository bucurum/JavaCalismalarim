import java.util.Scanner;

public class Hesap
{
    Scanner scanner = new Scanner(System.in);
    private int id;
    private int iban;
    private int sifre;
    private int hesapNo;
    private int bakiye;

    public Hesap(int id, int iban, int sifre, int hesapNo, int bakiye) {
        this.id = id;
        this.iban = iban;
        this.sifre = sifre;
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir()
    {
        System.out.println("Bakiyeniz: " + bakiye);
        System.out.println("Yatirmak istediginiz tutari yazin");
        int tutar;
        tutar = scanner.nextInt();
        bakiye += tutar;
        System.out.println("Yeni bakiye: " + bakiye);
    }
    public void paraCek()
    {
        System.out.println("Bakiyeniz: " + bakiye);
        System.out.println("Cekmek istediginiz tutari yazin ");
        int tutar;
        tutar = scanner.nextInt();
        if (bakiye < tutar)
            System.out.println("Yeterli bakiyeniz yok...");
        else {
            bakiye -= tutar;
            System.out.println("Yeni bakiye: " + bakiye);
        }
    }

}
