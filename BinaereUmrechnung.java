package BinaereUmrechnung;

public class BinaereUmrechnung {

    public static String binaereUmrechnung(StringBuilder binary, int numberDecimal) {

        if (numberDecimal == 0) {  
            return "0";
        }

        while (numberDecimal > 0) {
            int remainder = numberDecimal % 2;
            binary.append(remainder);
            numberDecimal = numberDecimal / 2;
        }

        binary.reverse();
        return binary.toString();
    }
}


