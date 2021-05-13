import java.util.Scanner;

public class Vector
{
    private String isim;
    private int a;
    private int b;
    private int c;

    public Vector(String isim)
    {
        this.isim = isim;
        Scanner scanner = new Scanner(System.in);
        System.out.println(isim + " in a b c degerlerini gir: ");
        System.out.print("a: ");
        this.a = scanner.nextInt();
        System.out.print("b: ");
        this.b = scanner.nextInt();
        System.out.print("c: ");
        this.c = scanner.nextInt();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
