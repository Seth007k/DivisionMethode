package BinaereUmrechnung;

public class BinaereUmrechnung {

    public static String binaereUmrechnung(StringBuilder binary, int numberDecimal) {

        // Frage 1:

        if (numberDecimal == 0) {   // Frage 2: Es wird 0 zurückgegeben
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

    /* Frage 3: Objekte, deren Zustand sich nicht verändern lassen, heissen im allgemeinen "immutable"
                Die Klasse String repräsentiert nicht veränderbare Zeichenketten. Somit ist ein String immer threadsicher.

                StringBuilder und StringBuffer repräsentieren im Gegensatz zu String dynamische, beliebig änderbare Zeichen-
                reihen. Der Unterschied zwischen diesen API-gleichen Klassen ist, dass StringBuffer vor nebenläufigen Operationen
                geschützt ist, StringBuilder nicht. <- "mutable"

       Frage 4: StringBuilder.append(String s) -> append Methoden hängen sich immer an das Ende an und vergrößern den internen Platz.
                String.concat verbindet bereits vordefinierten String mit neuen String.

       Frage 5: Lesbarkeit und Wartbarkeit von rekursiven Lösungen ist höher. Iterative Lösungen sind hingegen i.d.R. schneller.

       Frage 6: Die Methode wird unendlich oft aufgerufen und es ensteht eine Endlosschleife. Program bleibt höngen oder stürzt ab.

       Frage 7: Der Operator "==" vergleicht referenzen von Objekten und nicht den Inhalt der Objekte selbst. mit .equals() kann man den Inhalt von Strings
                vergleichen und es wird true zurückgegeben, wenn Inhalt gleich ist.

       Frage 8: String Pool ist Teil der Java Garbage Collection. Dient dazu, Speicherplatz zu sparen um Effizienz beim Umgang mit Strings zu verbessern.
                Wird von Java automatisch verwaltet. Wenn es nicht mehr referenziert wird, wird es aus dem String Pool entfernt und kann vom Garbage
                Collector freigegeben werden. Wenn wir einen String mit Schlüsselwort "new" erstellen, wird dieser String nicht im String Pool abgelegt,
                sondern als eigenständiges Objekt im Heap-Speicher erstellt. In diesem Fall wird der String nicht mit anderen Strings im String Pool verglichen
                und es wird immer ein neues Objekt erstellt, unabhängig vom Inhalt des Strings. Der String Pool wird außerdem in unterschiedlichen
                Versionen von Java auch unterschiedlich behandelt. In einigen Versionen wird der String Pool in den PermGen-Speicherbereich verschoben, während
                in neueren Versionen der String Pool in den Heap-Speicherbereich verschoben wurde.
     */

