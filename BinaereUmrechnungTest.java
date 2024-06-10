package Test;

import BinaereUmrechnung.BinaereUmrechnung;


class BinaereUmrechnungTest {

    @org.junit.jupiter.api.Test
    void binaereUmrechnung() {
        for (int i = 0; i < 256; i++) {
            String binary = BinaereUmrechnung.binaereUmrechnung(new StringBuilder(),i);
            System.out.println("Die Binärzahl von: " + i + " ist: " + binary);
        }
    }
}