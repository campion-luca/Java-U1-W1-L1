import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizi familiarizzazione con intellij");

        // richiamo il metodo static :
        System.out.println(Main.moltiplicazione());
        System.out.println(Main.concatenaNumConString());
        System.out.println(inserisciInArray());
        System.out.println(concatString());
        System.out.println(perimetroRettangolo());
        System.out.println(pariDispari());
        System.out.println(erone());
    }

//    // esercizio #1/1 , accetta due interi e ritorna il loro prodotto.
//    // void in quanto non devo restituire nulla, solo eseguire un'azione.

    static String moltiplicazione() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il primo numero");
        int primo = scan.nextInt();

        System.out.println("Inserisci il secondo numero");
        int secondo = scan.nextInt();

        return "Il risultato finale è: " + (primo * secondo);
    }

    // esercizio #1/2 , accetta una stringa e un intero e restituisce una stringa che concateni gli elementi :

    static String concatenaNumConString() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una parola");
        String parola = scan.nextLine();

        System.out.println("Inserisci un numero");
        int numero = scan.nextInt();

        return "La parola data " + parola + " con il tuo numero " + numero + " sono stati letti correttamente";
    }

    // esercizio #1/3 , accetta un array di stringhe di cinque elementi ed una stringa e restituisca un array di sei elementi in cui la stringa passata sia al terzo posto e le stringhe precedentemente in quarta e quinta posizione siano rispettivamente in quinta e sesta. :

    static String inserisciInArray() {
        String[] names = new String[6];

        names[0] = "Luca";
        names[1] = "Paolo";
        names[3] = "Giovanni";
        names[4] = "Franco";
        names[5] = "Alberto";

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci l'elemento dell'array mancante :");
        String elemento = scan.nextLine();

        names[2] = elemento;

        return Arrays.toString(names);
    }

      // esercizio #2

    static String concatString() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Inserisci la prima parola");
    String parola1 = scan.nextLine();

    System.out.println("Inserisci la seconda parola");
    String parola2 = scan.nextLine();

    System.out.println("Inserisci la terza parola");
    String parola3 = scan.nextLine();

    return parola1 + parola2 + parola3 + " e poi abbiamo inverito le parole " + parola3 + parola2 + parola1;
    }

    // esercizio #3/1

    static int perimetroRettangolo() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci l'altezza");
        int altezza = scan.nextInt();

        System.out.println("Inserisci la base");
        int base = scan.nextInt();

        int perimetro = 2 * (altezza + base);

        System.out.println("Il perimetro è ");
        return perimetro;
    }

    // esercizio #3/2

     static String pariDispari() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            return "il numero è pari";
        } else {
            return "il numero è dispari";
        }
    }

    // esercizio #3/3

    static String erone() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il primo lato");
        double a = scan.nextInt();

        System.out.println("Inserisci il secondo lato");
        double b = scan.nextInt();

        System.out.println("Inserisci il terzo lato");
        double c = scan.nextInt();

        double p = (a + b + c) / 2; // corretto, 21 cm

        double risB = (p - b);

        double risA = (p - a);

        double risC = (p - c);

        double ris = p * risA * risB * risC;


        return "l'area è : " + Math.sqrt(ris);
    }
}
