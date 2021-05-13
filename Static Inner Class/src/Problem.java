import java.util.Scanner;

public class Problem
{

    public static class Matematic
    {
       public static void DaireAlan(int yaricap)
        {
            double alan = yaricap * yaricap * Math.PI;
            System.out.println("Dairenin alani: " + alan);
        }
        public static void SilindirAlan(int yaricap, int yukseklik)
        {
            double alan = 2 * Math.PI * yaricap * (yaricap + yukseklik);
            System.out.println("Silindir'in alani: " + alan);
        }
        public static void ElipsALan(int yaricap1, int yaricap2)
        {
            double alan = Math.PI * yaricap1 * yaricap2;
            System.out.println("Elips'in alani: " + alan);
        }
    }
    public static class Fizik
    {
        public static void vektorCarpim(Vector vector1, Vector vector2)
        {
            int iccarpim = (vector1.getA() * vector2.getA() + vector1.getB() * vector2.getB() + vector1.getC() * vector2.getC());
            System.out.println(vector1.getIsim() + " ile " + vector2.getIsim() + " vektorunun carpimi = " + iccarpim);
        }
        public static void statikEnerji(int kutle, int hiz)
        {
            double statikenerji =  (kutle * (hiz * hiz))/ 2;
            System.out.println("Cismin statik enerjisi: " + statikenerji);
        }
        public static void potansiyelEnerji(int kutle, int yukseklik)
        {
            double potansiyelenerji = 9.81 * kutle * yukseklik;
            System.out.println("Cismin potansiyel enerjisi: " + potansiyelenerji);
        }
    }
}
