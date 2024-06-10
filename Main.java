package Main;
import BinaereUmrechnung.BinaereUmrechnung;

public class Main {
    public static void main(String[] args) {

        int number = 10;
        String binary = BinaereUmrechnung.binaereUmrechnung(new StringBuilder(),number);
        System.out.println(("Die Binärzahl von " + number + " ist: " + binary ));
    }
}