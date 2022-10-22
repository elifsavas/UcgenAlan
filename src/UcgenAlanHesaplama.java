import java.util.Scanner ;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {

        int a,b,c ;
        double cevre, u ;
        double alan ;

        Scanner sonuc = new Scanner(System.in);

        System.out.print("Birinci Kenar:");
        a = sonuc.nextInt() ;

        System.out.print("İkinci Kenar:");
        b = sonuc.nextInt() ;

        System.out.print("Üçüncü Kenar:");
        c = sonuc.nextInt() ;

        cevre = a + b + c ;
        u = cevre / 2 ;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
        System.out.println("Alan:" + alan);

    }
}
