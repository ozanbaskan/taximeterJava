package First;
import java.util.Scanner;
import java.lang.Math;

public class Taximeter {
    public static void main(String[] args) {
        double km, fee;
        Scanner s = new Scanner(System.in);
        System.out.print("Taksimetre için bir kilometre değeri giriniz: ");
        km = s.nextFloat();
        fee = km * 2.2 + 10 > 20 ? km * 2.2 + 10 : 20;
        System.out.print("Taksi ücretiniz: " + (Math.round(fee * 100.0) / 100.0) + " TL");
    }
}
