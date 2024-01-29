/*Scrivere un programma che, dato un tempo espresso in secondi, restituisca l’equivalente in ore,
minuti e secondi. Esempio: 7384 secondi corrispondono a 2 ore, 3 minuti e 4 secondi. 

Pietri Andrea 4AI
*/

package Es01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int secondi;
        int ore, minuti, secondiRimanenti;

        do {
            System.out.println("Inserisci un tempo in secondi: ");
            secondi = in.nextInt();
        } while (secondi < 0);

        ore = secondi / 3600;
        minuti = (secondi % 3600) / 60;
        secondiRimanenti = secondi % 60;

        System.out.println(secondi + " secondi equivalgono a: " + ore + " ore, " + minuti + " minuti e " + secondiRimanenti + "secondi.");

        in.close();
    }
}